import org.junit.Test;
import static org.junit.Assert.*;

class BShiftBugTest {
    @Test
    public void testBugTrigger() {
        int x = 1;
        int y = 2;
        int z = (x << 8) + y;
        assertEquals(289, z); // TRIGGER BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }
}