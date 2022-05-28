package kata.supermarket.discount;

import java.math.BigDecimal;

public class NoDiscountStrategy implements IDiscountStrategy {
    @Override
    public BigDecimal apply() {
        return BigDecimal.ZERO;
    }

}
