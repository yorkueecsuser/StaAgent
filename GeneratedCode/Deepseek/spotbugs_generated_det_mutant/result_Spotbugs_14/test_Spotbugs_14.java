import java.math.BigDecimal;
import static org.junit.Assert.*;
import org.junit.Test;

public class BigDecimalBugTest {
    @Test
    public void testShowBug() {
        BigDecimal buggyBigDecimal = BigDecimalBug.showBug();
        BigDecimal expectedBigDecimal = new BigDecimal("0.1"); // 0.1 is represented precisely in BigDecimal
        assertEquals(expectedBigDecimal, buggyBigDecimal);

        // TRIGGER BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        // The test should fail at this line due to DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE bug
    }
}