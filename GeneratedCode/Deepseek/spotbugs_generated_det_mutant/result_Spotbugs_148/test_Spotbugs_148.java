import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class BugDemoTest {
    @Test
    public void testShowBug() {
        BugDemo bugDemo = new BugDemo();
        List<String> result = bugDemo.showBug("");
        // Assert that the result is not null
        assertNotNull(result);
        // Assert that the result is an ArrayList
        assertTrue(result instanceof ArrayList);
        // Assert that the result size is 1
        assertEquals(1, result.size());
        // Assert that the first element of the result is "Input is empty."
        assertEquals("Input is empty.", result.get(0));
        // TRIGGER BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
    }
}