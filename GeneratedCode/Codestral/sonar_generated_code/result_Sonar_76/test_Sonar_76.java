import org.junit.Test;
import static org.junit.Assert.*;

public class ValueBasedClassLockingBugTest {

    @Test
    public void testShowBugWithNull() {
        ValueBasedClassLockingBug bugDemo = new ValueBasedClassLockingBug();
        bugDemo.showBug(null);  // TRIGGER BUG: Value-based classes should not be used for locking
    }

    @Test
    public void testShowBugWithSameObject() {
        Object obj = new Object();
        ValueBasedClassLockingBug bugDemo1 = new ValueBasedClassLockingBug();
        ValueBasedClassLockingBug bugDemo2 = new ValueBasedClassLockingBug();
        // Both bugDemo1 and bugDemo2 are using the same object for locking, causing contention and potential deadlock
        // This test case may not trigger the bug consistently, but it increases the likelihood of it happening
        new Thread(() -> bugDemo1.showBug(obj)).start();
        new Thread(() -> bugDemo2.showBug(obj)).start();
    }
}