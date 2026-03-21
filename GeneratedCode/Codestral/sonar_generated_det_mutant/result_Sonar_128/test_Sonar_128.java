import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingBugTest {

    @Test
    public void showBugTest() {
        DoubleCheckedLockingBug.showBug(); // TRIGGER BUG: Double-checked locking should not be used
        // The bug is triggered when multiple threads call the getInstance() method concurrently
        // as the double-checked locking does not guarantee a fully initialized instance
    }
}