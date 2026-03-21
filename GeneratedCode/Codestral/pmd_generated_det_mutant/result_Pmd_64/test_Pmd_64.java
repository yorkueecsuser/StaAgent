import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testEqualsAndHashCode() {
        BuggyClass buggy1 = new BuggyClass("Test");
        BuggyClass buggy2 = new BuggyClass("Test");

        // Both objects should be equal
        assertTrue(buggy1.equals(buggy2));

        // However, their hashcodes should not be equal since BuggyClass does not override hashCode
        // This can lead to inconsistent behavior in data structures that rely on both methods
        // TRIGGER BUG: OverrideBothEqualsAndHashcode
        assertNotEquals(buggy1.hashCode(), buggy2.hashCode());

        // Demonstrate the bug using the showBug method
        buggy1.showBug(buggy2);
    }
}