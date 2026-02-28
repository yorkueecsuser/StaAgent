import org.junit.Test;
import static org.junit.Assert.*;

public class FloggerExampleTest {

    @Test
    public void testShowBugWithDynamicMessage() {
        FloggerExample example = new FloggerExample();
        String dynamicMessage = "This is a dynamic log message.";
        
        // This line should trigger the bug because it uses a dynamic string
        String result = example.showBug(dynamicMessage); // TRIGGER BUG: FloggerLogString
        
        // Assert to simulate bug detection
        assertNotNull(result); // This will pass, but the bug is in the logger usage
    }

    @Test
    public void testShowBugWithEmptyMessage() {
        FloggerExample example = new FloggerExample();
        String dynamicMessage = "";
        
        // This line should trigger the bug because it uses a dynamic string
        String result = example.showBug(dynamicMessage); // TRIGGER BUG: FloggerLogString
        
        // Assert to simulate bug detection
        assertEquals("", result); // This will pass, but the bug is in the logger usage
    }
}