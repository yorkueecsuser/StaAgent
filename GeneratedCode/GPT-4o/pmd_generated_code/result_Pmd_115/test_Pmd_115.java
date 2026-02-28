import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchStatementExampleTest {

    @Test
    public void testShowBugWithCaseOne() {
        SwitchStatementExample example = new SwitchStatementExample();
        String result = example.showBug(1);
        assertEquals("One", result); // Should pass
    }

    @Test
    public void testShowBugWithDefaultCase() {
        SwitchStatementExample example = new SwitchStatementExample();
        String result = example.showBug(2);
        assertEquals("Two", result); // TRIGGER BUG: TooFewBranchesForASwitchStatement
    }
}