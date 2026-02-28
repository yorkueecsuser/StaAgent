import org.junit.Test;
import static org.junit.Assert.*;

public class DeadThreadBugTest {
    @Test
    public void testShowBug() {
        DeadThreadBug bug = new DeadThreadBug();
        bug.showBug();
        // TRIGGER BUG: DeadThread
        // The Thread is created but not started. No exception is thrown because JVM doesn't
        // enforce the rule of starting a thread before calling its join() method.
        // To trigger the bug, we just need to call showBug method.
    }
}