import org.junit.Test;
import static org.junit.Assert.*;

public class InterruptedBugExampleTest {

    @Test
    public void testShowBugWithDifferentThread() {
        InterruptedBugExample example = new InterruptedBugExample();
        Thread dummyThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        dummyThread.start();
        try {
            dummyThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        boolean result = example.showBug(dummyThread); // TRIGGER BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD) 
        assertFalse(result); // This assertion will likely fail because the method incorrectly checks the interrupted status of the current thread instead of the passed thread.
    }
}