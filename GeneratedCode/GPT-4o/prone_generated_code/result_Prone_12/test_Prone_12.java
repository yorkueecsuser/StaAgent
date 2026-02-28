import org.junit.Test;
import static org.junit.Assert.*;

public class ShiftOperationDemoTest {

    @Test
    public void testShiftBy32_ShouldTriggerBug() {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = 32; // Shift amount that is out of range for int
        int result = demo.showBug(number, shiftAmount); // TRIGGER BUG: BadShiftAmount
        assertEquals("Shifting by 32 should result in a no-op, hence result should be equal to number", number, result);
    }

    @Test
    public void testShiftByNegative_ShouldTriggerBug() {
        ShiftOperationDemo demo = new ShiftOperationDemo();
        int number = 1;
        int shiftAmount = -1; // Negative shift amount
        int result = demo.showBug(number, shiftAmount); // TRIGGER BUG: BadShiftAmount
        // Expecting a no-op due to the way shift operations handle negative amounts
        assertEquals("Negative shift amounts are not valid, expecting no-op, hence result should be equal to number", number, result);
    }
}