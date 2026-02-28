import org.junit.*;
import static org.junit.Assert.*;

public class BugExampleTest {

    private static BugExample bugExample;

    @BeforeClass
    public static void setUp() {
        bugExample = new BugExample();
    }

    @Test
    public void testShowBugTriggerBug() {
        bugExample.showBug(); // TRIGGER BUG: UseNotifyAllInsteadOfNotify
    }
}