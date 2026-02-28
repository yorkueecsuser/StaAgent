import org.junit.Test;
import static org.junit.Assert.*;

public class UnexpectedWarningExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        UnexpectedWarningExample example = new UnexpectedWarningExample();
        assertEquals("Input is null", example.showBug(null)); // TRIGGER BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING) 
    }

    @Test
    public void testShowBugWithNonNullInput() {
        UnexpectedWarningExample example = new UnexpectedWarningExample();
        assertEquals("HELLO", example.showBug("hello")); // TRIGGER BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING) 
    }
}