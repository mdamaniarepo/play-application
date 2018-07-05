package controllers;

import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;

import Repository.ProductRepository;
import actions.LoggingAction;
import actions.TransactionalAction;
import helper.JsonHelper;
import manager.ProductManager;
import manager.StockManager;
import models.Product;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import play.mvc.With;
import validations.CreateValidation;

@With(LoggingAction.class)
public class ProductsController extends Controller {

	private FormFactory formFactory;

	private ProductManager productManager;

	private ProductRepository productRepository;

	private JsonHelper jsonHelper;

	private StockManager stockManager;

	@Inject
	public ProductsController(FormFactory formFactory, ProductManager productManager,
			ProductRepository productRepository, JsonHelper jsonHelper, StockManager stockManager) {
		Logger.info("creating object ProductController");
		this.formFactory = formFactory;
		this.productManager = productManager;
		this.productRepository = productRepository;
		this.jsonHelper = jsonHelper;
		this.stockManager = stockManager;
	}

	public Result list() {
		return ok(views.html.products.list.render(productRepository.list()));
	}

	public Result newProduct() {
		Form<Product> productForm = formFactory.form(Product.class);
		return Results.ok(views.html.products.product.render(productForm));
	}

	public Result details(String ean) {
		Optional<Product> product = productRepository.lookupByEan(ean);
		if (!product.isPresent()) {
			return notFound(String.format("Product %s does not exist.", ean));
		}

		Form<Product> productForm = formFactory.form(Product.class).fill(product.get());
		return ok(views.html.products.product.render(productForm));
	}

	@With(TransactionalAction.class)
	public Result save() {
		Form<Product> productForm = formFactory.form(Product.class, CreateValidation.class).bindFromRequest();
		if (productForm.hasErrors()) {
			flash("error", "Please correct the below");
			return badRequest(views.html.products.product.render(productForm)); // if error re-render the page
		}

		Product product = productForm.get();
		product.setTags(productManager.getTagsForProduct(product.getTags())); // setting tags

		Optional<Product> existingProduct = productRepository.lookupByEan(product.getEan());
		if (existingProduct.isPresent()) {
			Optional<Product> updatedProduct = productRepository.update(existingProduct.get().getId(), product);
			flash("success", String.format("Successfully updated product %s", updatedProduct.get()));
			return redirect(routes.ProductsController.list());
		}

		productRepository.insert(product);

		// creating stock item for product
		stockManager.createStockItemForProduct(product);

		flash("success", String.format("Successfully added product %s", product));
		return redirect(routes.ProductsController.list());
	}

	@With(TransactionalAction.class)
	public Result delete(String ean) {
		Optional<Product> product = productRepository.lookupByEan(ean);
		if (!product.isPresent()) {
			return notFound(String.format("Product %s does not exist.", ean));
		}

		productRepository.delete(product.get().getId());
		flash("success", String.format("Successfully removed product %s", product));
		return redirect(routes.ProductsController.list());
	}

	// Json Service Methods

	public Result listProducts() {
		return ok(Json.toJson(productRepository.list()));
	}

	@BodyParser.Of(BodyParser.Json.class)
	public Result createProduct() {
		JsonNode jsonNode = request().body().asJson();
		if (null == jsonNode) {
			flash("error", "Invalid request, Expected Json");
			return badRequest(Json.toJson(jsonHelper.getJsonErrorResponse("Invalid request")));
		}

		Product product = Json.fromJson(jsonNode, Product.class);

		Optional<Product> existingProduct = productRepository.lookupByEan(product.getEan());
		if (existingProduct.isPresent()) {
			//productRepository.update(existingProduct.get().getId(), product);
			//return ok(Json.toJson(jsonHelper.getJsonSuccessResponse("Product Updated")));
			return badRequest(
					Json.toJson(jsonHelper.getJsonErrorResponse("Product exists, Ean: " + product.getEan() + " try using PUT instead")));
		}

		productRepository.insert(product);

		// creating stock item for product
		stockManager.createStockItemForProduct(product);

		return ok(Json.toJson(jsonHelper.getJsonSuccessResponse("Product created")));
	}

	@BodyParser.Of(BodyParser.Json.class)
	public Result updateProduct() {
		JsonNode jsonNode = request().body().asJson();
		if (null == jsonNode) {
			flash("error", "Invalid request, Expected Json");
			return badRequest(Json.toJson(jsonHelper.getJsonErrorResponse("Invalid request")));
		}

		Product product = Json.fromJson(jsonNode, Product.class);

		Optional<Product> existingProduct = productRepository.lookupByEan(product.getEan());
		if (!existingProduct.isPresent()) {
			return badRequest(
					Json.toJson(jsonHelper.getJsonErrorResponse("Product not found, Ean: " + product.getEan())));
		}

		existingProduct.ifPresent(p -> productRepository.update(p.getId(), product));
		return ok(Json.toJson(jsonHelper.getJsonSuccessResponse("Product updated")));
	}

	public Result retrieveProduct(String ean) {
		Optional<Product> product = productRepository.lookupByEan(ean);
		if (!product.isPresent()) {
			return badRequest(Json.toJson(jsonHelper.getJsonErrorResponse("Product not found, Ean: " + ean)));
		}

		return ok(Json.toJson(product.get()));
	}

	public Result deleteProduct(String ean) {
		Optional<Product> product = productRepository.lookupByEan(ean);
		if (!product.isPresent()) {
			return badRequest(Json.toJson(jsonHelper.getJsonErrorResponse("Product not found, Ean: " + ean)));
		}

		productRepository.delete(product.get().getId());
		return ok(Json.toJson(jsonHelper.getJsonSuccessResponse("Product deleted, ean: " + ean)));
	}

	public Result productByPathBinding(Product product) {
		return ok(Json.toJson(product));
	}

}
