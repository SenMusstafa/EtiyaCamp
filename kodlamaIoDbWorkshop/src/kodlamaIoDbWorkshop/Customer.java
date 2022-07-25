package kodlamaIoDbWorkshop;



public class Customer {
	private int id;
	private String customerNo;
	
	
	public Customer() {
		
	}
	public Customer(int id, String customerNo) {
		this.id = id;
		this.customerNo = customerNo;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	
	
}
