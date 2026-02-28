import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class BigDecimalBugTest {

    @Test
    public void showBugTest() {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal result = bug.showBug(); // TRIGGER BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        // We expect the value to be 0.1, but due to the bug, it's not
        assertEquals(new BigDecimal("0.1"), result);
    }
}