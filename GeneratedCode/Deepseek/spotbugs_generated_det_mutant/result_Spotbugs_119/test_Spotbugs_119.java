import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleLongBitsToDoubleInvokedOnIntTest {
    DoubleLongBitsToDoubleInvokedOnInt obj = new DoubleLongBitsToDoubleInvokedOnInt();

    @Test
    public void testBugTrigger() {
        // TRIGGER BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        assertTrue(Double.isNaN(obj.showBug()));
    }
}