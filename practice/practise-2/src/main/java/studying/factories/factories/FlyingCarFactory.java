package studying.factories.factories;

import studying.factories.domains.Car;
import studying.factories.domains.FlyingEngine;
import studying.factories.interfaces.ICarFactory;
import studying.factories.params.EmptyEngineParams;

public class FlyingCarFactory implements ICarFactory<EmptyEngineParams> {
    @Override
    public Car createCar(EmptyEngineParams carParams, int carNumber) {
        var engine = new FlyingEngine();

        return new Car(carNumber, engine);
    }
}
