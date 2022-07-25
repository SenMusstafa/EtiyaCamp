package kodlamaIoDbWorkshop;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer customer = new IndividualCustomer(1,"56321495","Mustafa","Şen","54556689713");
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);
		
		Address address = new Address(1, customer, "İzmir");
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address);
		
		Channel channel = new Channel(1, "İnternet", customers);
		
		System.out.println(customer.getId());
        System.out.println(customer.getCustomerNo());
        
		System.out.println(customer.getFirstName() +" " + channel.getName() + " kanalı ile eklendi.");
		
		
		
	}

}
