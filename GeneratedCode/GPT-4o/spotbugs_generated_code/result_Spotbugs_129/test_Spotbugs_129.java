import org.junit.Test;
import static org.junit.Assert.*;

public class ShiftOperationBugTest {

    @Test
    public void testShowBugWithShiftPrecedence() {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int x = 1;
        int y = 2;
        
        // Calculate expected result if operator precedence was correct
        int expected = (x << 8) + y;
        
        // Call method which has the bug
        int result = bugDemo.showBug(x, y); // TRIGGER BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        
        // This assertion should fail as the bug causes incorrect parsing
        assertEquals("The shift operation is not handled with the correct precedence", expected, result);
    }
}