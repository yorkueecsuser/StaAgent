import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleLongBitsBugTest {

    @Test
    public void testShowBug() {
        DoubleLongBitsBug bugDemo = new DoubleLongBitsBug();
        double result = bugDemo.showBug(123456789); // TRIGGER BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        assertNotEquals(0.0, result, 0.0);
    }

    @Test
    public void testShowBugWithZero() {
        DoubleLongBitsBug bugDemo = new DoubleLongBitsBug();
        double result = bugDemo.showBug(0); // TRIGGER BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        assertNotEquals(0.0, result, 0.0);
    }
}