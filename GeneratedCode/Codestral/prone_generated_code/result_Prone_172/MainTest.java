import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: UnusedAnonymousClass
        Main.showBug();
        // The bug is triggered because the Thread is created but never started.
        // Since the Thread is never started, the run() method inside the anonymous Runnable class is never executed,
        // and the preventMissionCriticalDisasters() method is never called.
        // Hence, the test will fail if it expects the method to be called.
    }
}