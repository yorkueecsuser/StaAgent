import org.junit.Test;
import static org.junit.Assert.*;

public class DeadStoreSwitchFallthroughTest {

    @Test
    public void testShowBug() {
        DeadStoreSwitchFallthrough deadStoreSwitchFallthrough = new DeadStoreSwitchFallthrough();

        // Test case with input 1 should not throw exception
        int result = deadStoreSwitchFallthrough.showBug(1);
        assertEquals(10, result);

        // Test case with input other than 1 should throw exception // TRIGGER BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
        result = deadStoreSwitchFallthrough.showBug(2);
        // The test should fail here because an exception is thrown but not caught
    }
}