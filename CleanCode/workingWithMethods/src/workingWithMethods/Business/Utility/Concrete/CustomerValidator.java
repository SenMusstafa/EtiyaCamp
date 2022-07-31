package workingWithMethods.Business.Utility.Concrete;

import workingWithMethods.Business.Utility.Abstract.Validator;
import workingWithMethods.Entity.Concrete.Customer;

public class CustomerValidator implements Validator{

	@Override
	public boolean validate(Customer customer) throws Exception {

        validateFirstNameIfEmpty(customer);
        validateFirstNameLength(customer);
        validateLastNameIfEmpty(customer);
        validateIdentityNumberIfEmpty(customer);
        
		return true;
	}
	private void validateFirstNameIfEmpty(Customer customer) throws Exception
    {
        if (String.valueOf(customer.getFirstName()).isEmpty()
        )
        {
            throw new Exception("Validasyon hatası oldu!");
        }
    }

    private void validateLastNameIfEmpty(Customer customer) throws Exception
    {
        if (String.valueOf(customer.getLastName()).isEmpty()
        )
        {
            throw new Exception("Validasyon hatası oldu!");
        }
    }

    private void validateIdentityNumberIfEmpty(Customer customer) throws Exception
    {
        if (String.valueOf(customer.getNationalId()).isEmpty()
        )
        {
            throw new Exception("Validasyon hatası oldu!");
        }
    }
    private void validateFirstNameLength(Customer customer) throws Exception
    {
        if (String.valueOf(customer.getFirstName()).length()<2)
        {
            throw new Exception("Validasyon hatası oldu!");
        }
    }
}
