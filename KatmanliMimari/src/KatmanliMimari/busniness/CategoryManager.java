package KatmanliMimari.busniness;

import KatmanliMimari.core.logging.ILogger;
import KatmanliMimari.dataAccess.ICategoryDao;
import KatmanliMimari.entities.Category;

public class CategoryManager {
	private ICategoryDao	categoryDao;
	private	ILogger[]		loggers;
	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception
	{
		Category[] categories = {
				new Category (1,"Mobil"),
				new Category (2,"Oyun")
		};
		for (Category category2 : categories) {
			if(category2.getCategoryName().equalsIgnoreCase(category.getCategoryName()))
			{
				throw new Exception("Kategori isimleri aynı olamaz");
			}
		}
		categoryDao.add(category);
		for(ILogger logger : loggers)
		{
			logger.log(category.getCategoryName());
		}
	}

}
