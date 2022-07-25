package kodlamaIoDbWorkshop;

import java.util.List;

public class Channel {
	private int id;
	private String name;
	private List<Customer> customers;
	
	public Channel() {
		
	}
	public Channel(int id, String name, List<Customer> customers) {
		super();
		this.id = id;
		this.name = name;
		this.customers = customers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
