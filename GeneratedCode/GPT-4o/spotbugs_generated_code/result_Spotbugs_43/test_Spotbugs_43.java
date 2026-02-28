import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchFallthroughExampleTest {

    @Test
    public void testShowBugWithValue1() {
        SwitchFallthroughExample example = new SwitchFallthroughExample();
        int result = example.showBug(1); // TRIGGER BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
        assertEquals(100, result); // This assertion will fail and trigger the bug.
    }

    @Test
    public void testShowBugWithValue2() {
        SwitchFallthroughExample example = new SwitchFallthroughExample();
        example.showBug(2); // TRIGGER BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
        // This will cause the test to fail due to the thrown exception
    }
}