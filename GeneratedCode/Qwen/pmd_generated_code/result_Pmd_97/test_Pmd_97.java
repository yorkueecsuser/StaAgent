import org.junit.Test;
import static org.junit.Assert.*;

public class ConcurrentAppTest {

    @Test
    public void testConcurrentHashMapUsage() {
        ConcurrentApp app = new ConcurrentApp();
        // Simulate concurrent access to trigger the bug
        Thread t1 = new Thread(() -> app.showBug(1, "Value1")); // TRIGGER BUG: UseConcurrentHashMap
        Thread t2 = new Thread(() -> app.showBug(2, "Value2")); // TRIGGER BUG: UseConcurrentHashMap

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            fail("Threads were interrupted");
        }

        // The test will not fail due to the bug itself, but it sets up a scenario where the bug can be observed
        // in a real multi-threaded environment. The actual failure would be observed outside of this test framework
        // due to race conditions or inconsistent state, which are hard to predict and reproduce in a controlled test.
    }
}