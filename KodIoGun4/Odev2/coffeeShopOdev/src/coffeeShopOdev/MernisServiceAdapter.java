package coffeeShopOdev;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException,Exception {
		// TODO Auto-generated method stub
	KPSPublicSoapProxy client=new KPSPublicSoapProxy();
	return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirtsName().toUpperCase(), customer.getLastName().toUpperCase(), Integer.parseInt(customer.getDateOfBirth()));
	}

}
