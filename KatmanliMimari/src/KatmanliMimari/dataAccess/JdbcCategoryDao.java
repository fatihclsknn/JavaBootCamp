package KatmanliMimari.dataAccess;

import KatmanliMimari.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veri tabanına eklendi");
	}

}
