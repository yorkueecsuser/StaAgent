import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyLoopTest {
    @Test
    public void testShowBug() {
        BuggyLoop buggyLoop = new BuggyLoop();
        // TRIGGER BUG: AvoidBranchingStatementAsLastInLoop
        assertFalse(buggyLoop.showBug(10));
    }
}