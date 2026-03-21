import org.junit.Test;
import static org.junit.Assert.*;

public class ByteShiftBugTest {
    ByteShiftBug bug = new ByteShiftBug();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: Raw byte values should not be used in bitwise operation with shift
        assertEquals(-1, bug.showBug());  // Line 15 is the line that triggers the bug
    }
}