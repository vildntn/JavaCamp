package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1= new Product(1,"Lenovo V14",15000,"16 Gb Ram",10); //ornek olusturma, referans oluþturma instance oluþturma

	    
	    Product product2= new Product(); //ornek olusturma, referans oluþturma instance oluþturma
	    product2.setId(2);
	    product2.setName("Lenovo V15");
	    product2.setDetail("32 GB Ram");
	    product2.setUnitPrice(16000);
	    product2.setDiscount(10);
	    
	    System.out.println(product2.getUnitPriceAfterDiscount());
	    Category category1=new Category();
		category1.setName("Bilgisayar");
		category1.setId(1);
		  
		Category category2=new Category();
		category2.setName("Ev/Bahçe");
		category2.setId(2);
		System.out.println(category1.getName());
		System.out.println(category2.getName());
//		  
	    
//	    Product product3= new Product(); //ornek olusturma, referans oluþturma instance oluþturma
//	    product3.setId(3);
//	    product3.setName("Hp 5");
//	    product3.setUnitPrice(10000);
//	    product3.setDetail("8 GB Ram");
//		Product[] products= {product1, product2, product3};
//		
//	  for (Product product : products) {
//			System.out.println(product.getName());
//		}
//	  System.out.println(products.length);
//	  
	
//	  ProductManager productManager =new ProductManager();
//	  productManager.addToCart(product1);
//	  productManager.addToCart(product2);
//	  productManager.addToCart(product3);

	}

}
