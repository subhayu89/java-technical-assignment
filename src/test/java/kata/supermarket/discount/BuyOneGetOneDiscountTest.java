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

public class BuyOneGetOneDiscountTest {

    @DisplayName("buy one get one free discount...")
    @MethodSource
    @ParameterizedTest(name = "{0}")
    void buyOneItemGetOneFree(String description, Item item, BigDecimal expectedDiscount) {
        BuyOneGetOneFreeDiscountStrategy bogo = new BuyOneGetOneFreeDiscountStrategy(item);
        assertEquals(expectedDiscount, bogo.apply());
    }

    static Stream<Arguments> buyOneItemGetOneFree() {
        return Stream.of(Arguments.of("two chips packets should have 50 pence discount", getPotatoChips(), new BigDecimal("0.50")));
    }


    private static Item getPotatoChips() {
        return new Product(new BigDecimal("0.50")).oneOf();
    }
}
