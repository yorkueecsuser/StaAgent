import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        int result = bugExample.showBug(); // TRIGGER BUG: Non-existent operators like "=+" should not be used
        assertNotEquals("The bug is not triggered as expected", -8, result);
    }
}