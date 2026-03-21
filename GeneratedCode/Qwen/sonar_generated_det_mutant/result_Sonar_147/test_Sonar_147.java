import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class BigDecimalBugExampleTest {

    @Test
    public void testShowBug() {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(); // TRIGGER BUG: "BigDecimal(double)" should not be used
        assertEquals(new BigDecimal("0.1"), result);
    }
}