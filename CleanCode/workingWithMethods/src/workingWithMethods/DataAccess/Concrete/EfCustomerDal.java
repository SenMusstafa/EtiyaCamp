package workingWithMethods.DataAccess.Concrete;

import workingWithMethods.DataAccess.Abstrack.ICustomerDal;
import workingWithMethods.Entity.Concrete.Customer;

public class EfCustomerDal implements ICustomerDal{

	@Override
	public void add(Customer customer) {
		System.out.println("Ef ile eklendi");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
		
		return false;
	}

}
