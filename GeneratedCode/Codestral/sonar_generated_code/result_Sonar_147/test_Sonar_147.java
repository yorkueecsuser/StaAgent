import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class BigDecimalBugTest {

    @Test
    public void testShowBug() {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal buggyDecimal = bug.showBug();  // TRIGGER BUG: "BigDecimal(double)" should not be used
        assertEquals(new BigDecimal("0.1"), buggyDecimal);
    }
}