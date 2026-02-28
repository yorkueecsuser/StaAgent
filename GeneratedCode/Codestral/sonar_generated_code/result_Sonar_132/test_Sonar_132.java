import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyEqualityChecksTest {

    @Test
    public void testShowBug() {
        BuggyEqualityChecks buggyEqualityChecks = new BuggyEqualityChecks();

        // TRIGGER BUG: Unnecessary equality checks should not be made
        assertTrue(buggyEqualityChecks.showBug());
    }
}