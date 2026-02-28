import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchFallThroughExampleTest {

    @Test
    public void testShowBugCase1() {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(1); // TRIGGER BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
        assertEquals(10, result); // This assertion will fail due to the bug
    }

    @Test
    public void testShowBugCase2() {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(2);
        assertEquals(20, result); // This assertion should pass
    }

    @Test
    public void testShowBugCase3() {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(3);
        assertEquals(30, result); // This assertion should pass
    }

    @Test
    public void testShowBugDefaultCase() {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        int result = example.showBug(4);
        assertEquals(40, result); // This assertion should pass
    }
}