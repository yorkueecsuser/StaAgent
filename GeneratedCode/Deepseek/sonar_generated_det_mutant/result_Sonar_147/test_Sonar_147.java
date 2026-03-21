import org.junit.Test;
import static org.junit.Assert.*;

public class BigDecimalBugTest {
    BigDecimalBug bugObject = new BigDecimalBug();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: "BigDecimal(double)" should not be used
        bugObject.showBug();
    }
}