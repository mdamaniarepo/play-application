package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.util.StringUtils;

import io.ebean.Finder;
import io.ebean.Model;
import play.Logger;
import play.data.validation.Constraints.Required;
import play.data.validation.Constraints.Validatable;
import play.data.validation.Constraints.Validate;
import play.data.validation.ValidationError;
import play.mvc.PathBindable;
import play.mvc.QueryStringBindable;
import validations.CreateValidation;
import validations.UpdateValidation;

@Validate(groups = { CreateValidation.class, UpdateValidation.class })
@Entity
public class Product extends Model
		implements PathBindable<Product>, QueryStringBindable<Product>, Validatable<List<ValidationError>> {

	public static Finder<Long, Product> finder = new Finder<>(Product.class);

	@Id
	public Long id;

	@Required(groups = { CreateValidation.class, UpdateValidation.class })
	public String ean;

	@Required(groups = { CreateValidation.class, UpdateValidation.class })
	public String name;

	@Required(groups = UpdateValidation.class)
	public String description;

	@OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
	public List<StockItem> stockItems;

	@ManyToMany(cascade = CascadeType.REMOVE)
	public List<Tag> tags;

	public Product() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String toString() {
		return String.format("%s - %s - %s - %s", id, ean, name, description);
	}

	@Override
	public String unbind(String key) {
		return this.ean;
	}

	@Override
	public String javascriptUnbind() {
		return this.ean;
	}

	@Override
	public Product bind(String key, String value) {
		return findByEan(value);
	}

	@Override
	public Optional<Product> bind(String key, Map<String, String[]> data) {
		Logger.info("Query String Binding : " + data + " : " + key);
		return Optional.of(findByEan(data.get(key) [0]));
	}

	public static Product findByEan(String ean) {
		return finder.query().where().eq("ean", ean).findOne();
	}

	@Override
	public List<ValidationError> validate() {
		final List<ValidationError> errors = new ArrayList<>();
		if (this.ean.length() > 13) {
			errors.add(new ValidationError("ean", "EAN length cannot be greater than 13 digits"));
			errors.add(new ValidationError("", "EAN length cannot be greater than 13 digits"));
		}

		if (!StringUtils.isEmpty(description) && this.description.length() < 5) {
			errors.add(new ValidationError("", "Description length cannot be less than 5 characters"));
		}
		return errors;
	}
}
