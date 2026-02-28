import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchFallThroughBugTest {

    @Test
    public void testShowBugCase1() {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        bugDemo.showBug(1); // TRIGGER BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
    }

    @Test
    public void testShowBugCase2() {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        bugDemo.showBug(2); // This will also trigger the exception, but the primary focus is on case 1
    }

    @Test
    public void testShowBugDefault() {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        assertEquals(0, bugDemo.showBug(3)); // This should pass and not trigger the bug
    }
}