package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.ebean.Finder;
import io.ebean.Model;

@Entity
public class Warehouse extends Model {

	public static Finder<Long, Warehouse> finder = new Finder<>(Warehouse.class);

	@Id
	public Long id;

	public String name;

	@OneToOne
	public Address address;

	@JsonIgnore
	@OneToMany(mappedBy = "warehouse")
	public List<StockItem> stockItems;

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

	public List<StockItem> getStockItems() {
		return stockItems;
	}

	public void setStockItems(List<StockItem> stockItems) {
		this.stockItems = stockItems;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
