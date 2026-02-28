import org.junit.*;
import static org.junit.Assert.*;

public class DoubleCheckedLockingBugTest {

    @Test
    public void testShowBug() {
        // TRIGGER BUG: Double-checked locking should not be used
        DoubleCheckedLockingBug bug = new DoubleCheckedLockingBug();
        DoubleCheckedLockingBug instance1 = bug.showBug();
        DoubleCheckedLockingBug instance2 = bug.showBug();
        assertNotSame(instance1, instance2);
    }
}