package Abstract;

import Entities.Customer;

public interface CustomerService {
    void register(Customer customer);
    void update(Customer customer,int id,String firstName,String lastName,int yearOfBirth,String nationalityId);
    void delete(Customer customer);
}
