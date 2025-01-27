package studying.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import studying.interfaces.ICarProvider;
import studying.interfaces.ICustomerProvider;

import java.util.Objects;

@Component
@RequiredArgsConstructor
public class HseCarService {

    private final ICarProvider carProvider;

    private final ICustomerProvider customerProvider;

    /**
     * Try to provide customers with cars
     */
    public void sellCars()
    {
        // получаем список покупателей
        var customers = customerProvider.getCustomers();
        // пробегаемся по полученному списку
        customers.stream().filter(customer -> Objects.isNull(customer.getCar()))
                .forEach(customer -> {
                    var car = carProvider.takeCar(customer);
                    if (Objects.nonNull(car)) {
                        customer.setCar(car);
                    }
                });
    }
}