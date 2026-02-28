import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample be = new BugExample();
        int result = be.showBug();
        // The bug is expected to return 10 (which is 00001010 in binary)
        // as a result of the shift operation with a shift amount of 32.
        // Since the shift amount is greater than 31, it is out of range.
        // The Java specification states that only the five lowest-order bits of the shift amount are used as the shift distance.
        // This means that shift amounts that are not in the range 0 to 31, inclusive, are silently mapped to values in that range.
        // The shift operation of the int type is equivalent to shifting by 0, i.e., a no-op.
        // Hence, the result should be 10 (which is 00001010 in binary)
        // TRIGGER BUG: BadShiftAmount
        assertEquals("The result should be 10", 10, result);
    }
}