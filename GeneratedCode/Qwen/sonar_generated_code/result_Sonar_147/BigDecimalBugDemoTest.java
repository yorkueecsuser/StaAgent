import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class BigDecimalBugDemoTest {

    @Test
    public void testShowBug() {
        BigDecimalBugDemo demo = new BigDecimalBugDemo();
        BigDecimal expected = new BigDecimal("0.1");
        BigDecimal actual = demo.showBug(); // TRIGGER BUG: "BigDecimal(double)" should not be used
        assertEquals(expected, actual);
    }
}