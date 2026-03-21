import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadInterruptionBugTest {
    private ThreadInterruptionBug bug;

    @Test
    public void bugTriggerTest() {
        Thread thread = new Thread();
        bug = new ThreadInterruptionBug(thread);
        boolean result = bug.showBug(); // TRIGGER BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        assertFalse(result);
    }
}