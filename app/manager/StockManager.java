package manager;

import org.apache.commons.lang3.RandomUtils;

import com.google.inject.Inject;

import Repository.StockRepository;
import models.Product;
import models.StockItem;
import models.Warehouse;

public class StockManager {

	private StockRepository stockRepository;

	@Inject
	public StockManager(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}

	public Long createStockItemForProduct(Product product) {
		StockItem stockItem = new StockItem();
		stockItem.setQuantity(1L);
		stockItem.setProduct(product);
		stockItem.setWarehouse(Warehouse.finder.byId(getWarehouseId()));
		return stockRepository.insert(stockItem);
	}

	public Long getWarehouseId() {
		Long randomLong = RandomUtils.nextLong();
		if (randomLong % 2 != 0) {
			return randomLong % 2;
		}

		return 2L;
	}

}
