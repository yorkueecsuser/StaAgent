import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class DecimalLiteralBigDecimalTest {

    @Test
    public void testShowBug() {
        DecimalLiteralBigDecimal example = new DecimalLiteralBigDecimal();
        BigDecimal result = example.showBug(); // TRIGGER BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        // The expected value should be exactly 0.1, but due to the bug, it's not.
        BigDecimal expected = new BigDecimal("0.1");
        assertEquals("The BigDecimal value is not as expected due to precision issues.", expected, result);
    }
}