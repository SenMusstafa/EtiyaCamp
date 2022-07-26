package entities;

public class Address {
	private int id;
	private String addressDetail;
	private AddressType addressTypeId;
	private Customer customerId;
	
	public Address() {
		super();
	}

	public Address(int id, String addressDetail, AddressType addressTypeId, Customer customerId) {
		super();
		this.id = id;
		this.addressDetail = addressDetail;
		this.addressTypeId = addressTypeId;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public AddressType getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(AddressType addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	
	
	
}
