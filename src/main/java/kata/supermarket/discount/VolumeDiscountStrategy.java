package kata.supermarket.discount;

import kata.supermarket.Item;

import java.math.BigDecimal;


public class VolumeDiscountStrategy implements IDiscountStrategy {
    private final Item item;
    private final BigDecimal percent;

    public VolumeDiscountStrategy(Item item, BigDecimal percent) {
        this.item = item;
        this.percent = percent;
    }

    @Override
    public BigDecimal apply() {
        return item.price().subtract(item.price().multiply(percent));
    }
}
