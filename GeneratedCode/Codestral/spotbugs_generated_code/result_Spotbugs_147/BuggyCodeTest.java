import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();

        // Test case for existing number
        assertEquals("one", buggyCode.showBug(1));

        // Test case for missing number in the map
        assertNull("Expected null for missing number 3", buggyCode.showBug(3)); // TRIGGER BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
    }
}