package hse.kpo.reports;

import hse.kpo.domains.Customer;
import hse.kpo.domains.Car;
import hse.kpo.domains.Ship;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReportBuilder {
    private final StringBuilder content = new StringBuilder();

    public ReportBuilder addCustomers(List<Customer> customers) {
        content.append("Покупатели:");
        customers.forEach(customer -> content.append(String.format(" - %s", customer)));
        content.append("\n");

        return this;
    }

    public ReportBuilder addCars(List<Car> cars) {
        content.append("Машины:");
        cars.forEach(car -> content.append(String.format(" - %s", car)));
        content.append("\n");

        return this;
    }

    public ReportBuilder addShips(List<Ship> ships) {
        content.append("z Корабли:");
        ships.forEach(ship -> content.append(String.format(" - %s", ship)));
        content.append("\n");

        return this;
    }

    public ReportBuilder addOperation(String operation) {
        content.append(String.format("Операция: %s", operation));
        content.append(System.lineSeparator());
        return this;
    }

    public Report build() {
        var DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return new Report(String.format("Отчет за %s", ZonedDateTime.now().format(DATE_TIME_FORMATTER)), content.toString());
    }
}
