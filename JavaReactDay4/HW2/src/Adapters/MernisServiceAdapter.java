package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
    	
    	boolean result=false;
    	
    	KPSPublicSoap client = new KPSPublicSoapProxy();

    	try {
			if(client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), 
					customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.getYearOfBirth())) {
				result=true;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		} catch (RemoteException e) {
			e.printStackTrace();
			
		}
    	
    	return result;
    }
}
