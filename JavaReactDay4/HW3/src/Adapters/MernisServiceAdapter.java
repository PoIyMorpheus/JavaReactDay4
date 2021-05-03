package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        if ((customer.getNationalityId().length()==11) && (customer.getYearOfBirth()>1900)){
            return true;
        }
        else return false;
    }
}
