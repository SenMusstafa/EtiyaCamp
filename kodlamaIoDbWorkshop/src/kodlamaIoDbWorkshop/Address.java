package kodlamaIoDbWorkshop;

public class Address {
	private int id;
	private Customer customer;
	private String detay;
	
	public Address() {
		
	}

	public Address(int id, Customer customer, String detay) {
		super();
		this.id = id;
		this.customer = customer;
		this.detay = detay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getDetay() {
		return detay;
	}

	public void setDetay(String detay) {
		this.detay = detay;
	}
	
}
