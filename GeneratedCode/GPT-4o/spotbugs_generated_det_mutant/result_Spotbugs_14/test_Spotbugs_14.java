import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class BigDecimalBugExampleTest {

    @Test
    public void testShowBugWithDouble() {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(0.1); // TRIGGER BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        
        // The expected value is the precise BigDecimal representation of 0.1
        BigDecimal expected = BigDecimal.valueOf(0.1);
        
        // This will fail due to precision loss in the original method
        assertEquals("The BigDecimal representation should be precise", expected, result);
    }
}