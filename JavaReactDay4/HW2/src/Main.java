import java.time.LocalDate;
import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		
		
		Customer customer=new Customer(1,"Recep Batuhan","Dikmen",2001,"11111111111");
		customerManager.save(customer);
    }
}
