package entities;

import java.util.List;

public class CorporateCustomer extends Customer{

	private String companyName;
	private String taxNumber;

	
	public CorporateCustomer() {
		super();
	}

	public CorporateCustomer(int id, String customerNumber,List<Subscription> subcriptions, List<Address> addresses ,String  companyName, String taxNumber) {
		super(id, customerNumber, subcriptions,addresses);
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	
	
}
