package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new 	Product(1, "Lenovo 14", 15000, "16 GB Ram", 10);
		
		
		Product product2 = new 	Product();
		product2.setId(2);
		product2.setName("Lenovo 15");
		product2.setUnitPrice(16000);
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Product product3 = new 	Product();
		product3.setId(3);
		product3.setName("Hp 5");
		product3.setUnitPrice(10000);
		product3.setDetail("8 GB Ram");
		product3.setDiscount(10);
		
		
		Product[] products = {product1,product2,product3};
		for (Product product : products){
			
			System.out.println(product.getName());
		
		}
			
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ev/Bahçe");
		
		System.out.println(category2.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}

}
