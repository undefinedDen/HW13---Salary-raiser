package app.repository;

import app.entity.Customer;
import app.model.AppModel;

public class CustomerRepository {
    public Customer[] getCustRepository(){
        return new Customer[]{
                new Customer("Bob", 2000.47),
                new Customer("Denys", 5000.65),
                new Customer("Viktoria", 35057.24),
                new Customer("Roman", 5000.65)};
    }

}
