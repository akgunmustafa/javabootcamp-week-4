package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements IProductDao{
	public void add(Product product) {
		//Sadece DB erişim kodları buraya yazılır.
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
