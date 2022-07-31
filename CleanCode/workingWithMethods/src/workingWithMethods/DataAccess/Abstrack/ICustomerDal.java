package workingWithMethods.DataAccess.Abstrack;

import workingWithMethods.Entity.Concrete.Customer;

public interface ICustomerDal {
	void add(Customer customer);
	boolean customerExists(Customer customer);
}
