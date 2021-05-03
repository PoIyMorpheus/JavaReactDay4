package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;

public class GamingCustomerManager extends BaseCustomerManager {
    public GamingCustomerManager(CustomerCheckService customerCheckService) {
        super(customerCheckService);
    }
}
