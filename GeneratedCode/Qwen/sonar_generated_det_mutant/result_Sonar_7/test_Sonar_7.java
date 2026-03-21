import org.junit.Test;
import static org.junit.Assert.*;

public class BlockingOperationBugTest {

    @Test
    public void testShowBug() {
        BlockingOperationBug bugDemo = new BlockingOperationBug();
        String result = bugDemo.showBug("https://httpbin.org/delay/5"); // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations
        assertEquals("Check console for response details", result);
    }
}