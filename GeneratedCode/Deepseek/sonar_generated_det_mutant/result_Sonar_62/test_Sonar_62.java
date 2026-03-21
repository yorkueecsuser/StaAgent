import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test 
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        String[] towns = bugExample.showBug();
        assertEquals("Chicago", towns[0]);  // TRIGGER BUG: Map values should not be replaced unconditionally
    }
}