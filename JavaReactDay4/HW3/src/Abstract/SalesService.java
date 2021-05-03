package Abstract;

import Entities.Campaign;
import Entities.Customer;

public interface SalesService {
    void buy(Customer customer, Product product);
    void buy(Customer customer, Product product, Campaign campaign);
    void toReturn(Customer customer,Product product);
}
