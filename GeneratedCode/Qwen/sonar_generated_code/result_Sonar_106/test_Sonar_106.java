import org.junit.Test;
import static org.junit.Assert.*;

public class LockAndSleepExampleTest {

    @Test
    public void testShowBugFailsWhenConditionNotMet() {
        LockAndSleepExample example = new LockAndSleepExample();
        assertFalse(example.showBug().equals("Condition met")); // TRIGGER BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
    }

    @Test
    public void testShowBugFailsWhenConditionMetAfterSleep() {
        LockAndSleepExample example = new LockAndSleepExample();
        new Thread(() -> {
            try {
                Thread.sleep(500); // Wait for main thread to enter the lock
                example.setConditionMet(true);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
        assertFalse(example.showBug().equals("Condition met")); // TRIGGER BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
    }
}