import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleConversionBugExampleTest {
    
    @Test
    public void testShowBug() {
        DoubleConversionBugExample example = new DoubleConversionBugExample();
        double result = example.showBug(); // TRIGGER BUG: "Double.longBitsToDouble" should take "long" as argument
        assertFalse(Double.isNaN(result)); // The test will fail because the result will be NaN
    }
}