import org.junit.Test;
import static org.junit.Assert.*;

public class BigDecimalTestTest { // TRIGGER BUG: "BigDecimal(double)" should not be used
    @Test
    public void testShowBug() {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }
}