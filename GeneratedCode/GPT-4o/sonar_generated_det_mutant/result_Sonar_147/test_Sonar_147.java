import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class BigDecimalDemoTest {

    @Test
    public void testShowBugWithDoubleInput() {
        BigDecimalDemo demo = new BigDecimalDemo();
        double inputValue = 0.1;
        BigDecimal expected = new BigDecimal("0.1");
        BigDecimal actual = demo.showBug(inputValue); // TRIGGER BUG: "BigDecimal(double)" should not be used
        assertEquals("The BigDecimal conversion should match the expected value.", expected, actual);
    }
}