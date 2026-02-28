import org.junit.Test;
import static org.junit.Assert.*;

public class SleepWithLockBugTest {

    @Test
    public void testShowBug() {
        SleepWithLockBug instance = new SleepWithLockBug();
        instance.showBug(); // TRIGGER BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
        fail("The test should fail due to improper use of Thread.sleep while holding a lock."); // This line ensures the test fails
    }
}