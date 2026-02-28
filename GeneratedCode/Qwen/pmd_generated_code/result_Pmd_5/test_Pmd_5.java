import org.junit.Test;
import static org.junit.Assert.*;

public class BranchingBugExampleTest {

    @Test
    public void testShowBugTriggersBug() {
        BranchingBugExample example = new BranchingBugExample();
        assertEquals(5, example.showBug()); // TRIGGER BUG: AvoidBranchingStatementAsLastInLoop
    }
}