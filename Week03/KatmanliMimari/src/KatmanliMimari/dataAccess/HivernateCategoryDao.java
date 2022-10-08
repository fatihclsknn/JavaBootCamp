package KatmanliMimari.dataAccess;

import KatmanliMimari.entities.Category;

public class HivernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile kategori eklendi.");
	}

}
