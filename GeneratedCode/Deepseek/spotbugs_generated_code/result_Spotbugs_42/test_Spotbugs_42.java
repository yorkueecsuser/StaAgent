import org.junit.Test;
import static org.junit.Assert.*;

public class DeadStoreDueToSwitchFallThroughTest {
    @Test
    public void testShowBug() {
        DeadStoreDueToSwitchFallThrough obj = new DeadStoreDueToSwitchFallThrough();

        // TRIGGER BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
        assertEquals("Weekday", obj.showBug(5));
        assertEquals("Weekend", obj.showBug(6));
    }
}