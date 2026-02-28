import org.junit.Test;
import static org.junit.Assert.*;

public class NonCaseLabelInSwitchStatementBugTest {

    @Test
    public void testNonCaseLabelSwitchStatementBug() {
        NonCaseLabelInSwitchStatementBug bug = new NonCaseLabelInSwitchStatementBug();

        // TRIGGER BUG: NonCaseLabelInSwitchStatement
        assertEquals("Sunday", bug.showBug(7));
    }
}