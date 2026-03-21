import org.junit.Test;
import static org.junit.Assert.*;

public class BranchingBugExampleTest {

    @Test
    public void testShowBug() {
        BranchingBugExample example = new BranchingBugExample();
        int result = example.showBug(); // TRIGGER BUG: AvoidBranchingStatementAsLastInLoop
        assertNotEquals("The result should not be 0 due to the loop logic", 0, result);
    }
}