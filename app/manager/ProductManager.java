package manager;

import java.util.ArrayList;
import java.util.List;

import models.Tag;

public class ProductManager {

	public ProductManager() {

	}

	/**
	 * This methods gets tags from DB based on the id.
	 * 
	 * @param tags
	 * @return
	 */
	public List<Tag> getTagsForProduct(List<Tag> tags) {
		List<Tag> dbTags = new ArrayList<Tag>();
		for (Tag tag : tags) {
			if (null != tag.getId()) {
				dbTags.add(Tag.finder.byId(tag.getId()));
			}
		}
		return dbTags;
	}

}
