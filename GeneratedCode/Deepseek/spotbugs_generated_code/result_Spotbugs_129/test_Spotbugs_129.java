import org.junit.Test;
import static org.junit.Assert.*;

public class ShiftBugTest {
    @Test
    public void testShowBug() {
        ShiftBug shiftBug = new ShiftBug();
        int x = 2;
        int y = 3;
        // The correct result should be (x << 8) + y = 515, but due to the bug, it results in x << (8 + y) = 2048
        // TRIGGER BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        assertEquals(515, shiftBug.showBug(x, y));
    }
}