package kodlamaIoDbWorkshop;



public class CorporateCustomer extends Customer{
	private String unvan;
	private String taxNo;
	
	
	public CorporateCustomer(int id, String customerNo) {
		super(id, customerNo);
	}
	public CorporateCustomer(int id, String customerNo, String unvan,
			String taxNo) {
		super(id, customerNo);
		this.unvan = unvan;
		this.taxNo = taxNo;
		
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public String getTaxNo() {
		return taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	
}
