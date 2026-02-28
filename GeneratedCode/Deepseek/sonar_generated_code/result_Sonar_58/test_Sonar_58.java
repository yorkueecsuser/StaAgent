import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

public class BugExampleTest {

    // Test case that does not trigger the bug
    @Test
    public void testRead_NoBug() throws IOException {
        byte[] buffer = new byte[]{65, 66, 67, 68};
        BugExample bugExample = new BugExample(buffer);
        int value = bugExample.showBug();
        assertTrue(value >= 0 && value <= 255);
    }

    // Test case that triggers the bug
    @Test
    public void testRead_TriggerBug() throws IOException {
        byte[] buffer = new byte[]{65, 66, 67, 68};
        BugExample bugExample = new BugExample(buffer);
        int value = bugExample.showBug();
        assertTrue(value >= -1 && value <= 127); // This test case should fail as the bug is triggered here
        // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
    }
}