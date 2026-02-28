import org.junit.Test;
import static org.junit.Assert.*;

public class AssignmentInOperandExampleTest {

    @Test
    public void testShowBugTriggersAssignmentInOperand() {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        int result = example.showBug(2); // TRIGGER BUG: AssignmentInOperand
        assertEquals(3, result); // This assertion will fail because the method modifies the input parameter
    }
}