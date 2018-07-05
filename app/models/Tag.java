package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints.Required;

@Entity
public class Tag extends Model {

	public static List<Tag> tags = new ArrayList<Tag>();

	public static Finder<Long, Tag> finder = new Finder<>(Tag.class);

	@Id
	public Long id;

	@Required
	public String name;

	@JsonIgnore
	@ManyToMany(mappedBy = "tags")
	public List<Product> products;

	public Tag() {

	}

	public Tag(Long id, String name, Collection<Product> products) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
