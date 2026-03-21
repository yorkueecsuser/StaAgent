import org.junit.Test;
import static org.junit.Assert.*;

public class LockHeldSleepBugTest {

    @Test
    public void testShowBug() {
        LockHeldSleepBug bugExample = new LockHeldSleepBug();
        String result = bugExample.showBug(); // TRIGGER BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
        assertEquals("Bug demonstrated", result);
    }
}