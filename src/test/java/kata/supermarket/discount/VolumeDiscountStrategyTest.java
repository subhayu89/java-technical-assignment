package kata.supermarket.discount;

import kata.supermarket.Item;
import kata.supermarket.WeighedProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class VolumeDiscountStrategyTest {
    @DisplayName("volume discount")
    @ParameterizedTest(name = "{0}")
    @MethodSource
    void volumeDiscount(String description, Item item, BigDecimal expectedDiscount) {
        VolumeDiscountStrategy volumeDiscountStrategy = new VolumeDiscountStrategy(item, new BigDecimal("0.20"));
        assertEquals(expectedDiscount, volumeDiscountStrategy.apply().setScale(2));
    }

    static Stream<Arguments> volumeDiscount() {
        return Stream.of(Arguments.of("1 kg tomato at 20% discount", getTomato(), new BigDecimal("0.32")));
    }


    private static Item getTomato() {
        return new WeighedProduct(new BigDecimal("0.4")).weighing(new BigDecimal(1));
    }
}
