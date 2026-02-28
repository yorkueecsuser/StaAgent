import org.junit.Test;
import static org.junit.Assert.*;

public class ByteShiftBugTest {
    @Test
    public void testShowBug() {
        ByteShiftBug bugObject = new ByteShiftBug();
        byte b = (byte) 0b10000000; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        int result = bugObject.showBug(b);
        assertEquals(-2147483648, result); // The result should be -2147483648 (0b10000000000000000000000000000000 in int), but the bug causes it to be 0
    }
}