package studying.factories.factories;

import studying.factories.domains.Car;
import studying.factories.domains.HandEngine;
import studying.factories.interfaces.ICarFactory;
import studying.factories.params.EmptyEngineParams;

public class HandCarFactory implements ICarFactory<EmptyEngineParams> {
    @Override
    public Car createCar(EmptyEngineParams carParams, int carNumber) {
        var engine = new HandEngine(); // Создаем двигатель без каких-либо параметров

        return new Car(carNumber, engine); // создаем автомобиль с ручным приводом
    }
}
