import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugTest {

    @Test
    public void showBugTest() throws InterruptedException {
        SynchronizationBug bug = new SynchronizationBug();
        int initialValue = bug.getValue();

        Thread thread1 = new Thread(() -> bug.setValue(initialValue + 10));
        Thread thread2 = new Thread(() -> bug.getValue()); // TRIGGER BUG: Getters and setters should be synchronized in pairs

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // Since setValue is not synchronized, the values could be inconsistent
        // If this assertion fails, it triggers the bug and shows that the value was not correctly updated
        assertNotEquals(initialValue, bug.getValue());
    }
}