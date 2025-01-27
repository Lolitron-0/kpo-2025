package studying.factories.interfaces;

import studying.factories.domains.Car;
import studying.factories.domains.Customer;

public interface ICarProvider {
    Car takeCar(Customer customer); // Метод возвращает optional на Car, что означает, что метод может ничего не вернуть
}
