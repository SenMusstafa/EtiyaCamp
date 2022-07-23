package classWithAttirbutes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product( id=1, name="Laptop", description="Asus", price=5000, stockAmount=3, renk="Siyah" );
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus") ;
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	}

}
