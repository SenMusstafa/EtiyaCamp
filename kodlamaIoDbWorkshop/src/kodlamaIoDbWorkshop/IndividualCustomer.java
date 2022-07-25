package kodlamaIoDbWorkshop;



public class IndividualCustomer extends Customer {
	private String firstName;
	private String lastName;
	private String nationalId;

	
	public IndividualCustomer(int id, String customerNo) {
		super(id, customerNo);
	}

	public IndividualCustomer(int id, String customerNo, String firstName,
			String lastName, String nationalId ) {
		super(id, customerNo);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		
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

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
}
