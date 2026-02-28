import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchStatementExampleTest {

    @Test
    public void testShowBugWithCase1() {
        SwitchStatementExample example = new SwitchStatementExample();
        assertEquals("One", example.showBug(1)); // TRIGGER BUG: TooFewBranchesForASwitchStatement
    }

    @Test
    public void testShowBugWithDefaultCase() {
        SwitchStatementExample example = new SwitchStatementExample();
        assertEquals("Other", example.showBug(2)); // TRIGGER BUG: TooFewBranchesForASwitchStatement
    }

    @Test
    public void testShowBugWithAnotherDefaultCase() {
        SwitchStatementExample example = new SwitchStatementExample();
        assertEquals("Other", example.showBug(3)); // TRIGGER BUG: TooFewBranchesForASwitchStatement
    }
}