import org.junit.Test;
import static org.junit.Assert.*;

public class CheckNotNullMultipleTimesExampleTest {

    @Test
    public void testShowBugWithNonNullInput() {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        String result = example.showBug("Hello, World!"); // TRIGGER BUG: CheckNotNullMultipleTimes
        assertEquals("Processed: Hello, World!", result); // This is expected to pass
    }
    
    @Test
    public void testShowBugWithNullInput() {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        String result = example.showBug(null); // TRIGGER BUG: CheckNotNullMultipleTimes
        assertEquals("Input was null", result); // This is expected to pass
    }
    
    @Test
    public void testShowBugTrigger() {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        String result = example.showBug("This should trigger the bug!"); // TRIGGER BUG: CheckNotNullMultipleTimes
        assertNotEquals("Processed: This should trigger the bug!", result); // This is expected to fail to highlight the bug
    }
}