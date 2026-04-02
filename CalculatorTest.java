import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void add_2_plus_3_equals_5() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void subtract_5_minus_3_equals_2() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void multiply_4_times_3_equals_12() {
        assertEquals(12, calc.multiply(4, 3));
    }
}
