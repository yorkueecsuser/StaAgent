import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        Map<String, String> source = bugExample.showBug(); // TRIGGER BUG: Double Brace Initialization should not be used
        assertTrue(source.size() == 2); // This failing assertion is expected as the bug is triggered
    }
}