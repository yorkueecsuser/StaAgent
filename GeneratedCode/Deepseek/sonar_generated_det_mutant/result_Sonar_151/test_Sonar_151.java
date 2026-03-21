import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;

public class BugExampleTest {
    @Test
    public void testBugExample() {
        BugExample bugExample = new BugExample();
        try {
            bugExample.showBug();
            fail("Expected an IOException to be thrown"); // TRIGGER BUG: Resources should be closed
        } catch (IOException e) {
            // This is expected
        }
    }
}