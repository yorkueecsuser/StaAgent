import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleBitsBugTest {

    @Test
    public void testShowBugWithInt() {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        double result = bugDemo.showBug(123456789); // TRIGGER BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        assertEquals("This test will fail due to incorrect usage of Double.longBitsToDouble", 0.0, result, 0.0);
    }
}