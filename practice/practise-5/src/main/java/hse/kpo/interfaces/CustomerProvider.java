package hse.kpo.interfaces;

import hse.kpo.domains.Customer;
import java.util.List;

/**
 * Interface for customer provider.
 */
public interface CustomerProvider {
    List<Customer> getCustomers();
}
