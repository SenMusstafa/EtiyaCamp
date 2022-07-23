	package coffeeShopOdev;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	   
	   private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
		    public void Save(Customer customer) throws Exception  {
		          if(CustomerCheckService.checkIfRealPerson(customer))
		          { 
		        	  super.Save(customer);  
		          } 
		          else {
		          throw new Exception("Not a valid person");
		          }
		    }

		
	
}
