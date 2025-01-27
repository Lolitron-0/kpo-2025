package studying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import studying.domains.Customer;
import studying.factories.FlyingCarFactory;
import studying.factories.HandCarFactory;
import studying.factories.PedalCarFactory;
import studying.params.EmptyEngineParams;
import studying.params.PedalEngineParams;
import studying.services.CarService;
import studying.services.CustomerStorage;
import studying.services.HseCarService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}
