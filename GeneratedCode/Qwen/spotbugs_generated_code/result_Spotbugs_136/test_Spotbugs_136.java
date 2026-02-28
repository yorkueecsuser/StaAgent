import org.junit.Test;
import static org.junit.Assert.*;

public class BooleanAssignmentBugTest {

    @Test
    public void testShowBug() {
        BooleanAssignmentBug bugDemo = new BooleanAssignmentBug();
        assertFalse(bugDemo.showBug()); // TRIGGER BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
    }
}