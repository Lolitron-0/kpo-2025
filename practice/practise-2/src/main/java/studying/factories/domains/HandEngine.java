package studying.factories.domains;

import lombok.ToString;
import studying.factories.interfaces.IEngine;

@ToString
public class HandEngine implements IEngine {
    @Override
    public boolean isCompatible(Customer customer) {
        return customer.getHandPower() > 5;
    }
}
