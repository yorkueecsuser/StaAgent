import org.junit.Test;
import static org.junit.Assert.*;

public class AssignmentInOperandTest {
    AssignmentInOperand buggyCode = new AssignmentInOperand();

    @Test
    // TRIGGER BUG: AssignmentInOperand
    public void testShowBug() {
        buggyCode.showBug(3); // This will trigger the bug as x is assigned in the operand of the if condition
    }
}