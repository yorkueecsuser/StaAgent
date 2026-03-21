import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleBitsBugTest {

    @Test
    public void testShowBug() {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890; // TRIGGER BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        bug.showBug(input);
    }
}