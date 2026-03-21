import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    private BugDemo bugDemo = new BugDemo();

    @Test
    public void testBugTrigger() {
        int buggyLineNumber = bugDemo.showBug();
        // TRIGGER BUG: AvoidLiteralsInIfCondition
        // The test should fail as it is expecting the bug to be triggered at line number 20, 36 and 43
        assertTrue(buggyLineNumber == 20 || buggyLineNumber == 36 || buggyLineNumber == 43);
    }
}