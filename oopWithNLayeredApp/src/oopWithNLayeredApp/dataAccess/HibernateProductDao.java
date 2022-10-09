package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements IProductDao {
	public void add(Product product) {
		//Sadece DB erişim kodları buraya yazılır.
		System.out.println("Hibernate  ile veritabanına eklendi");
	}

}
