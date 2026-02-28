import org.junit.Test;
import static org.junit.Assert.*;

public class GuardedByBugTest {

    @Test(timeout = 1000)
    public void testGuardedByViolation() {
        GuardedByBug buggyClass = new GuardedByBug();

        Thread thread1 = new Thread(() -> {
            buggyClass.showBug("Thread 1"); // TRIGGER BUG: GUARDEDBY_VIOLATION
        });

        Thread thread2 = new Thread(() -> {
            buggyClass.showBug("Thread 2"); // TRIGGER BUG: GUARDEDBY_VIOLATION
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}