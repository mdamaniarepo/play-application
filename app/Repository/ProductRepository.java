package Repository;

import java.util.List;
import java.util.Optional;

import com.google.inject.Inject;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.Transaction;
import models.Product;
import play.Logger;
import play.db.ebean.EbeanConfig;


public class ProductRepository {

	private final EbeanServer ebeanServer;

	@Inject
	public ProductRepository(EbeanConfig ebeanConfig) {
		this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
	}

	public Optional<Product> lookup(Long id) {
		return Optional.ofNullable(ebeanServer.find(Product.class).setId(id).findOne());
	}

	public Optional<Product> lookupByEan(String ean) {
		return Optional.ofNullable(ebeanServer.find(Product.class).where().eq("ean", ean).findOne());
	}

	public Optional<Product> update(Long id, Product newProductData) {
		Transaction txn = ebeanServer.beginTransaction();
		Optional<Product> value = Optional.empty();
		try {
			Product savedProduct = ebeanServer.find(Product.class).setId(id).findOne();
			if (null != savedProduct) {
				savedProduct.setEan(newProductData.getEan());
				savedProduct.setName(newProductData.getName());
				savedProduct.setDescription(newProductData.getDescription());
				savedProduct.setTags(newProductData.getTags());
				ebeanServer.update(savedProduct);
				txn.commit();
				value = Optional.of(savedProduct);
			}
		} finally {
			txn.end();
		}
		return value;
	}

	public Long insert(Product product) {
		ebeanServer.save(product);
		return product.id;
	}

	public Optional<Long> delete(Long id) {
		try {
			Logger.info("Product Id for delete: " + id);
			final Optional<Product> productOptional = Optional
					.ofNullable(ebeanServer.find(Product.class).setId(id).findOne());
			productOptional.ifPresent(ebeanServer::delete);
			return productOptional.map(p -> p.id);
		} catch (Exception e) {
			return Optional.empty();
		}
	}

	public List<Product> list() {
		return ebeanServer.find(Product.class).findList();
	}

}
