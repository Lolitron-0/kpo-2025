package hse.kpo.domains;

import hse.kpo.interfaces.IEngine;
import lombok.ToString;

/**
 * Domain class for hand engine.
 */
@ToString
public class HandEngine implements IEngine {
    @Override
    public boolean isCompatible(Customer customer) {
        return customer.getHandPower() > 5;
    }
}
