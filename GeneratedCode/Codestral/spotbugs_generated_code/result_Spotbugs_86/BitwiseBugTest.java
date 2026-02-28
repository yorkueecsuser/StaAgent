import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseBugTest {
    @Test
    public void testShowBugWithNonZeroNumber() {
        BitwiseBug bug = new BitwiseBug();
        // TRIGGER BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        assertFalse(bug.showBug(1));
    }
}