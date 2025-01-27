package studying.factories.domains;

import lombok.Getter;
import lombok.ToString;
import studying.factories.interfaces.IEngine;

@ToString
@Getter
public class PedalEngine implements IEngine {
    private final int size;

    @Override
    public boolean isCompatible(Customer customer) {
        return customer.getLegPower() > 5;
    }

    public PedalEngine(int size) {
        this.size = size;
    }
}
