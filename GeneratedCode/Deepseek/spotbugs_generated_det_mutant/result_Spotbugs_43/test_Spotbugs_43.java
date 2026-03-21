import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    private BugExample bugExample = new BugExample();

    @Test
    public void showBugTriggersDeadStoreDueToSwitchFallThroughTest() {
        try {
            bugExample.showBug();
        } catch (RuntimeException e) {
            // Expected to catch the RuntimeException thrown in the switch statement
        }

        // TRIGGER BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
    }
}