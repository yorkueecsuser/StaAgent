import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class BigDecimalBugExampleTest {

    @Test
    public void testShowBug() {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal expectedValue = new BigDecimal("0.1");
        BigDecimal actualValue = example.showBug(); // TRIGGER BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        assertEquals(expectedValue, actualValue);
    }
}