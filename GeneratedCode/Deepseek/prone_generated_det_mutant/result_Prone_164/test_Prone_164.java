import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    // TRIGGER BUG: TreeToString
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        try {
            bugExample.showBug(null);
            fail("Expected an NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // Expected exception is thrown. Test case is passed.
        }
    }
}