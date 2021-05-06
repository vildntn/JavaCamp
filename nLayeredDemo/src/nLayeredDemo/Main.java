package nLayeredDemo;


import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concreates.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concreates.AbcProductDao;
import nLayeredDemo.dataAccess.concreates.HibernateProductDao;
import nLayeredDemo.entities.concreates.Product;

public class Main {

	public static void main(String[] args) {
		//Todo:spring IoC ile çözülecek
		ProductService productService=new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		Product product=new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
