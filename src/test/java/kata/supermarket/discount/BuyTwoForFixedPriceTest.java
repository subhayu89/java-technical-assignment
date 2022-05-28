package kata.supermarket.discount;

import kata.supermarket.Item;
import kata.supermarket.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class BuyTwoForFixedPriceTest {
    @DisplayName("buy two for fixed price...")
    @ParameterizedTest(name = "{0}")
    @MethodSource
    void buyTwoForFixedPrice(String description, Item item1, Item item2, BigDecimal fixedPrice, BigDecimal expectedDiscount) {
        BuyTwoForFixedPriceStrategy buyTwoForFixedPrice = new BuyTwoForFixedPriceStrategy(item1, item2, fixedPrice);
        assertEquals(expectedDiscount, buyTwoForFixedPrice.apply());
    }

    static Stream<Arguments> buyTwoForFixedPrice() {
        return Stream.of(Arguments.of("two potato chips packets at fixed price 60 should have 20 pence discount", getPotatoChips(), getPotatoChips(), new BigDecimal("0.60"), new BigDecimal("0.20")));
    }


    private static Item getPotatoChips() {
        return new Product(new BigDecimal("0.40")).oneOf();
    }
}
