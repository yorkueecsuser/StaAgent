import org.junit.Test;
import static org.junit.Assert.*;

public class UnconditionalIfStatementBugTest {

    @Test
    public void testShowBugWithAlwaysFalseCondition() {
        UnconditionalIfStatementBug bugObject = new UnconditionalIfStatementBug();
        boolean result = bugObject.showBug(false); // TRIGGER BUG: UnconditionalIfStatement
        assertEquals(false, result); // This assertion will fail because the "return false;" line is unreachable
    }
}