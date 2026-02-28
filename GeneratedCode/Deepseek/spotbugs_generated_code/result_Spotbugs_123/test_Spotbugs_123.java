import org.junit.Test;
import static org.junit.Assert.*;

public class InstanceofBugTest {

    @Test
    public void testShowBugWithObjectInstance() {
        InstanceofBug bug = new InstanceofBug();
        Object obj = new Object();
        assertFalse(bug.showBug(obj)); // TRIGGER BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }

    @Test
    public void testShowBugWithStringInstance() {
        InstanceofBug bug = new InstanceofBug();
        String str = new String("Test");
        assertTrue(bug.showBug(str)); // Valid test case, should not trigger the bug
    }
}