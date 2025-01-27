package studying.factories.interfaces;

import studying.factories.domains.Customer;

import java.util.List;

public interface ICustomerProvider {
    /**
     * метод возвращает коллекцию только для чтения, так как мы не хотим давать вызывающему коду возможность изменять список
     */
    List<Customer> getCustomers();
}
