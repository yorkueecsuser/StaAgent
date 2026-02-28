import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBugSuccess() {
        // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
        assertEquals(200, bugExample.showBug(true));
    }

    @Test
    public void testShowBugFailure() {
        // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
        assertEquals(400, bugExample.showBug(false));
    }
}