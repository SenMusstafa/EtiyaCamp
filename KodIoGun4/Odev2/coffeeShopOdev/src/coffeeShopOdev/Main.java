package coffeeShopOdev;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new BaseCustomerManager() {};
		customerManager.save(new Customer(1,"Mustafa","şen","1992.01.12","303545418"));

	}

}
