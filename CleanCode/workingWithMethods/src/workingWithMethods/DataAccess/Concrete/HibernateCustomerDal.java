package workingWithMethods.DataAccess.Concrete;

import workingWithMethods.DataAccess.Abstrack.ICustomerDal;
import workingWithMethods.Entity.Concrete.Customer;

public class HibernateCustomerDal implements ICustomerDal {

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate ile eklendi");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
		
		return false;
	}
	
}
