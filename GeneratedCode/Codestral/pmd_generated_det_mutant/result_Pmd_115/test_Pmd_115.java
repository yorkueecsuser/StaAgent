import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchStatementBugTest {

    @Test
    public void testShowBug() {
        SwitchStatementBug bug = new SwitchStatementBug();

        // Testing with weekdays
        assertEquals("Weekday", bug.showBug(1));
        assertEquals("Weekday", bug.showBug(5));

        // Testing with weekends
        assertEquals("Weekend", bug.showBug(6));
        assertEquals("Weekend", bug.showBug(7));

        // Triggering the bug by providing invalid day values
        assertNull(bug.showBug(0));  // TRIGGER BUG: TooFewBranchesForASwitchStatement
        assertNull(bug.showBug(8));  // TRIGGER BUG: TooFewBranchesForASwitchStatement
    }
}