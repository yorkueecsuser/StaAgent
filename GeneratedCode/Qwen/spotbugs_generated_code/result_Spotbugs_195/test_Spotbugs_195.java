import org.junit.Test;
import static org.junit.Assert.*;

public class BaseClassTest {

    @Test
    public void testCloneMethodTriggersBug() {
        try {
            CloneExample.showBug(); // TRIGGER BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
            fail("The test should have failed due to the bug in the clone method.");
        } catch (AssertionError e) {
            // Expected failure due to the bug
        }
    }
}