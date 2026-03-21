import org.junit.Test;
import static org.junit.Assert.*;

public class ByteShiftBugTest {

    @Test
    public void testShowBug() {
        ByteShiftBug bug = new ByteShiftBug();
        byte b = (byte) 0b1000_0000; // -128 in decimal
        // TRIGGER BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        assertEquals(-64, bug.showBug(b));
    }
}