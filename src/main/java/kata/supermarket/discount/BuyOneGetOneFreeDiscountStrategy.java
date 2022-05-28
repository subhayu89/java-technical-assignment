package kata.supermarket.discount;

import kata.supermarket.Item;

import java.math.BigDecimal;

public class BuyOneGetOneFreeDiscountStrategy implements IDiscountStrategy {

    private final Item item;

    public BuyOneGetOneFreeDiscountStrategy(Item item) {
        this.item = item;
    }

    @Override
    public BigDecimal apply() {
        return item.price();
    }

}
