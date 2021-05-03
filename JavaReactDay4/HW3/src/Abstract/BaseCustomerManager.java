package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    CustomerCheckService customerCheckService;

    public BaseCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    public void register(Customer customer){
        if (customerCheckService.checkIfRealPerson(customer)) {
            System.out.println(customer.getFirstName() + " kaydedildi.");
        }
        else System.out.println("Girilen bilgiler hatalı. "+ customer.getFirstName()+" maalesef kaydedilemedi." );
    }

    public void update(Customer customer,int id,String firstName,String lastName,int yearOfBirth,String nationalityId){

        if (customerCheckService.checkIfRealPerson(new Customer(id, firstName, lastName, yearOfBirth, nationalityId))) {
            customer.setId(id);
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setYearOfBirth(yearOfBirth);
            customer.setNationalityId(nationalityId);

            System.out.println(customer.getFirstName() + " güncellendi.");
        }
        else System.out.println("Girilen bilgiler hatalı. "+ customer.getFirstName()+" maalesef güncellenemedi.." );
    }
    public void delete(Customer customer){
        System.out.println(customer.getFirstName()+" silindi.");
    }
}
