package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "123465";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "654988";
		
		UnionCustomer unionCustomer = new UnionCustomer();
		unionCustomer.customerNumber = "987655";
		
		CustomerManeger customerManeger = new CustomerManeger();
		customerManeger.add(hepsiBurada);
		customerManeger.add(engin);
		customerManeger.add(unionCustomer);
		
		Customer[] customers = {engin,hepsiBurada,unionCustomer};
		customerManeger.addMultiple(customers);
	}

}
