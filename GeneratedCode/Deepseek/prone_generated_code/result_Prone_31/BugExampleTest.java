import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test // TRIGGER BUG: DeadException
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        Exception deadException = bugExample.showBug();
        assertNotNull(deadException); // This test will fail if the deadException is null
    }
}