import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseOperationBugTest {
    @Test
    public void testShowBugWithNegativeVal() {
        BitwiseOperationBug bug = new BitwiseOperationBug();
        boolean result = bug.showBug(-2); // TRIGGER BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        assertFalse(result); // The test case fails because the bug in the showBug method causes an unexpected result
    }
}