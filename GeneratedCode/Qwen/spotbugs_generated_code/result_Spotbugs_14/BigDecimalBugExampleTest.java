import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class BigDecimalBugExampleTest {

    @Test
    public void testShowBug() {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(); // TRIGGER BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        assertEquals(new BigDecimal("0.1"), result);
    }
}