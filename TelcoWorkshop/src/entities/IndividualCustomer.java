package entities;

import java.util.List;

public class IndividualCustomer extends Customer{

	private String nationalIdentity;
	private String firstName;
	private String lastName;

	public IndividualCustomer() {
		super();
	}

	public IndividualCustomer(int id, String customerNumber, List<Subscription> subcriptions, List<Address> addresses,String nationalIdentity, String firstName, String lastName) {
		super(id,customerNumber, subcriptions, addresses);
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
