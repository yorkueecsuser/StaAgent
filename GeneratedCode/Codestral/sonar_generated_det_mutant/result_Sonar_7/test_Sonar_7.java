import org.junit.Test;
import static org.junit.Assert.*;

public class PlatformThreadWithBlockingOperationTest {

    @Test
    public void testShowBug() {
        PlatformThreadWithBlockingOperation obj = new PlatformThreadWithBlockingOperation();
        obj.showBug("http://example.com"); // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations
        // The bug is triggered in the showBug method when a platform thread is created with a task that includes a heavy blocking operation
    }
}