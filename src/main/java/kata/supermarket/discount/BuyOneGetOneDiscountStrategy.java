package kata.supermarket.discount;

import kata.supermarket.Item;

import java.math.BigDecimal;

public class BuyOneGetOneDiscountStrategy implements IDiscountStrategy {

    private final Item item;

    public BuyOneGetOneDiscountStrategy(Item item) {
        this.item = item;
    }

    @Override
    public BigDecimal apply() {
        return item.price();
    }


//    @Override
//    public BigDecimal getDiscount(ItemByUnit itemObj, int units) {
//        if(units==0)
//            return BigDecimal.ZERO;
//        else if(units%2==0)
//            return itemObj.price().multiply(new BigDecimal(units / 2));
//        else
//            return itemObj.price().multiply(new BigDecimal((units-1) / 2));
//    }
//
//    @Override
//    public BigDecimal getDiscount(ItemByWeight itemByWeight, int units) {
//        return null;
//    }

}
