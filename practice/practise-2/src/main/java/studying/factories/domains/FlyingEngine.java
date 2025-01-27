package studying.factories.domains;

import lombok.ToString;
import studying.factories.interfaces.IEngine;

@ToString
public class FlyingEngine implements IEngine {
    @Override
    public boolean isCompatible(Customer customer) {return customer.getIQ() > 300;}
}
