import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingTest {
    @Test
    public void testGetInstance() {
        String temp = DoubleCheckedLocking.getInstance();
        assertNotNull(temp);
        assertEquals("This is the only instance", temp);
    }

    @Test
    public void testShowBug() {
        DoubleCheckedLocking.showBug();
        // TRIGGER BUG: Double-checked locking should not be used
    }
}