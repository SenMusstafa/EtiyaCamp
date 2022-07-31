package workingWithMethods.Business.Utility.Abstract;

import workingWithMethods.Entity.Concrete.Customer;

public interface Validator {
	boolean validate(Customer customer) throws Exception;
}
