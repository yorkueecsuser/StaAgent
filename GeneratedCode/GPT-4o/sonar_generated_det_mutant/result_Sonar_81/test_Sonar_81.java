import org.junit.Test;
import static org.junit.Assert.*;

public class NonFinalClassTest {
    
    @Test
    public void testShowBug() {
        NonFinalClass instance1 = new NonFinalClass();
        NonFinalClass instance2 = new NonFinalClass();
        
        Thread thread1 = new Thread(() -> instance1.showBug()); // TRIGGER BUG: "getClass" should not be used for synchronization
        Thread thread2 = new Thread(() -> instance2.showBug()); // TRIGGER BUG: "getClass" should not be used for synchronization

        thread1.start();
        thread2.start();

        // Join threads to ensure both complete; this is not strictly necessary for the test to fail
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            fail("Thread was interrupted");
        }

        // To observe the issue, the test will not assert anything; the bug manifests in concurrent behavior
        // If not synchronized properly on the same object, the output may show mixed results
    }
}