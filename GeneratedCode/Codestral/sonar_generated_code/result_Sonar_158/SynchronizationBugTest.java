import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugTest {

    @Test
    // TRIGGER BUG: Synchronization should not be done on instances of value-based classes
    public void testSyncMethod() {
        SynchronizationBug bug = new SynchronizationBug();
        int x = 0;

        // Start two threads that will try to synchronize on the same Integer objects
        Thread thread1 = new Thread(() -> bug.syncMethod(x));
        Thread thread2 = new Thread(() -> bug.syncMethod(x));

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Since the two threads are synchronizing on the same Integer objects,
        // this test will fail due to the bug
        // If the bug is fixed, this test will pass
    }
}