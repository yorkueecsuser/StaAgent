import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    // TRIGGER BUG: NoCanIgnoreReturnValueOnClasses
    public void testNoCanIgnoreReturnValueOnClasses() {
        BuggyClass buggy = new BuggyClass();
        assertNotNull(buggy);
        buggy.showBug();
    }
}