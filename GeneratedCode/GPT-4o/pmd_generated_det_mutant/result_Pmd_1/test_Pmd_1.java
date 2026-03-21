import org.junit.Test;
import static org.junit.Assert.*;

public class AssignmentInOperandExampleTest {

    @Test
    public void testShowBug_ShouldFailDueToAssignmentInOperand() {
        AssignmentInOperandExample example = new AssignmentInOperandExample();
        boolean result = example.showBug(); // TRIGGER BUG: AssignmentInOperand
        assertFalse("The method should return false, but returned true due to the bug.", result);
    }
}