package kata.supermarket.discount;

import java.math.BigDecimal;


public class VolumeDiscountStrategy implements IDiscountStrategy {
    @Override
    public BigDecimal apply() {
        return BigDecimal.ZERO;
    }
}
