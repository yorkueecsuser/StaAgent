import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingExampleTest {

    @Test
    public void testShowBug() {
        // Call the showBug method to trigger the bug
        Integer result = DoubleCheckedLockingExample.showBug(); // TRIGGER BUG: Double-checked locking should not be used
        assertNotNull(result);
        assertEquals(Integer.valueOf(42), result); // This assertion may fail due to the bug
    }
}