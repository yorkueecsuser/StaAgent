import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingBugTest {
    @Test
    public void testDoubleCheckedLockingBug() {
        DoubleCheckedLockingBug bug = new DoubleCheckedLockingBug();
        Object obj1 = bug.showBug(); // TRIGGER BUG: DoubleCheckedLocking
        Object obj2 = bug.showBug();
        assertNotSame(obj1, obj2); // If the bug is not triggered, this will pass
    }
}