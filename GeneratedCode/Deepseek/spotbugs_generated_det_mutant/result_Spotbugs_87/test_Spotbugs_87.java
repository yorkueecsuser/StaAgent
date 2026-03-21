import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    // TRIGGER BUG: BIT: Incompatible bit masks (BIT_IOR)
    public void testShowBug() {
        BuggyCode bug = new BuggyCode();
        int e = 5;
        int C = 3;
        int D = 7;
        // This should fail because (e | C) == D is always true due to the specific values of constants C and D
        assertFalse(bug.showBug(e, C, D)); // This will trigger the bug
    }
}