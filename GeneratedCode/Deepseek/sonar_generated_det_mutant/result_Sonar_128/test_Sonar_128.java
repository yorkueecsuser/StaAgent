import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingBugTest {
    @Test
    // TRIGGER BUG: Double-checked locking should not be used
    public void testDoubleCheckedLockingBug() {
        DoubleCheckedLockingBug bug = new DoubleCheckedLockingBug();
        new Thread(() -> {
            bug.showBug(10);
        }).start();
        bug.showBug(10);
    }
}