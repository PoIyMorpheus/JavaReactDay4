package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Customer;
import Abstract.Product;

public class SalesManager implements SalesService {
    @Override
    public void buy(Customer customer, Product product) {
        System.out.println(customer.getFirstName()+", "+product.getName()+" adlı ürünü satın aldı.");
    }

    @Override
    public void buy(Customer customer, Product product, Campaign campaign) {
        System.out.println(customer.getFirstName()+", "+product.getName()+" adlı ürünü, "
                +campaign.getName()+" kampanyasından faydalanarak satın aldı.");
    }

    @Override
    public void toReturn(Customer customer, Product product) {
        System.out.println(customer.getFirstName()+", "+product.getName()+" adlı ürünü iade etti.");
    }
}
