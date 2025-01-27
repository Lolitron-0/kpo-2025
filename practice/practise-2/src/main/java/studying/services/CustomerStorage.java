package studying.services;

import lombok.ToString;
import studying.domains.Customer;
import studying.interfaces.ICustomerProvider;

import java.util.ArrayList;
import java.util.List;
@ToString
public class CustomerStorage implements ICustomerProvider {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer); // просто добавляем покупателя в список
    }
}
