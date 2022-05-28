package kata.supermarket.discount;

import java.math.BigDecimal;

public interface IDiscountStrategy {
    BigDecimal apply();
}
