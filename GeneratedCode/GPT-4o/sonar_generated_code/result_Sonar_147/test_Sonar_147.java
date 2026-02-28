import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class BigDecimalBugExampleTest {

    @Test
    public void testShowBugWithSmallDouble() {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue); // TRIGGER BUG: "BigDecimal(double)" should not be used
        assertEquals(new BigDecimal("0.1"), result);
    }

    @Test
    public void testShowBugWithExactDouble() {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.5;
        BigDecimal result = example.showBug(inputValue); // TRIGGER BUG: "BigDecimal(double)" should not be used
        assertEquals(new BigDecimal("0.5"), result);
    }
}