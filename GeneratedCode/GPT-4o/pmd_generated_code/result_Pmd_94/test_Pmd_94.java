import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingExampleTest {

    @Test
    public void testShowBugShouldTriggerBug() {
        DoubleCheckedLockingExample example = new DoubleCheckedLockingExample();
        
        Object firstResult = example.showBug(); // TRIGGER BUG: DoubleCheckedLocking
        Object secondResult = example.showBug(); // TRIGGER BUG: DoubleCheckedLocking
        
        // The test expects the same instance to be returned, but due to the bug,
        // it might get a partially constructed object or different instances.
        assertSame("Objects should be the same instance", firstResult, secondResult);
    }

    @Test
    public void testShowBugNotReturningNull() {
        DoubleCheckedLockingExample example = new DoubleCheckedLockingExample();

        Object result = example.showBug(); // TRIGGER BUG: DoubleCheckedLocking

        // The test expects a non-null result, but due to the bug,
        // it might get a null or partially initialized object.
        assertNotNull("Object should not be null", result);
    }
}