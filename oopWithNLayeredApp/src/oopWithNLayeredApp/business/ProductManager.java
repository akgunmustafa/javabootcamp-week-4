package oopWithNLayeredApp.business;

//import java.util.Iterator;
//import java.util.List;
//import oopWithNLayeredApp.dataAccess.HibernateProductDao;
//import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.IProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private IProductDao productDao;
	private Logger[] loggers;
	
	
	
	public ProductManager(IProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}


	public void add(Product product) throws Exception {

		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olmaaz");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
			
		}

	}

}
