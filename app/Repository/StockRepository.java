package Repository;

import java.util.List;

import com.google.inject.Inject;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import models.StockItem;
import play.db.ebean.EbeanConfig;

public class StockRepository {
	
	private final EbeanServer ebeanServer;

	@Inject
	public StockRepository(EbeanConfig ebeanConfig) {
		this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
	}
	
	public Long insert(StockItem stockItem) {
		ebeanServer.save(stockItem);
		return stockItem.id;
	}

	public List<StockItem> list() {
		return ebeanServer.find(StockItem.class).findList();
	}

}
