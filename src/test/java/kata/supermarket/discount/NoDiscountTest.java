package kata.supermarket.discount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class NoDiscountTest {
    @DisplayName("no discount on products...")
    @MethodSource
    @ParameterizedTest(name = "{0}")
    void noDiscount(String description, BigDecimal expectedDiscount) {
        NoDiscountStrategy noDiscount = new NoDiscountStrategy();
        assertEquals(expectedDiscount, noDiscount.apply());
    }

    static Stream<Arguments> noDiscount() {
        return Stream.of(Arguments.of("chips packet have no discount", BigDecimal.ZERO));
    }
}
