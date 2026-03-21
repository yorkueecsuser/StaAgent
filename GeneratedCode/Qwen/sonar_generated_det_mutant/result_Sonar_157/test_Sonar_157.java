import org.junit.Test;
import static org.junit.Assert.*;

public class IfElseIfBugExampleTest {

    @Test
    public void testShowBugWithDuplicateCondition() {
        IfElseIfBugExample example = new IfElseIfBugExample();
        assertEquals("moveWindowToTheBackground", example.showBug(1)); // TRIGGER BUG: Related "if/else if" statements should not have the same condition
    }
}