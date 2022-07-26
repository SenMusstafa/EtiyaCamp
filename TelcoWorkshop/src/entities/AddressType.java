package entities;

public class AddressType {
	private int id;
	private String addressTypeName;
	
	public AddressType() {
		super();
	}

	public AddressType(int id, String addressTypeName) {
		super();
		this.id = id;
		this.addressTypeName = addressTypeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressTypeName() {
		return addressTypeName;
	}

	public void setAddressTypeName(String addressTypeName) {
		this.addressTypeName = addressTypeName;
	}
	
}	
