import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugTest {

    @Test
    public void testSyncMethod() throws InterruptedException {
        SynchronizationBug bug = new SynchronizationBug();
        bug.showBug(0); // TRIGGER BUG: Synchronization should not be done on instances of value-based classes

        // Since the bug is demonstrated by causing deadlock, this test will hang indefinitely if the bug is present.
        // Therefore, this test should be manually terminated if it doesn't finish within a reasonable time.
        // If the bug is not present, this test will pass without any issues.
    }
}