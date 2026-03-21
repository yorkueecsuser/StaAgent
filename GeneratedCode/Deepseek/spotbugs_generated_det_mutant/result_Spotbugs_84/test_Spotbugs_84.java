import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseBugTest {

    @Test
    public void testShowBug() {
        // Negative number 'CONSTANT'
        int val = 10;
        int constant = -1;
        // Calling the method that triggers the bug
        boolean result = BitwiseBug.showBug(val, constant);
        //'result' should be false as it is the result of a comparison operation on two negative numbers
        // This test case will fail if the bug is not triggered
        assertFalse(result); // TRIGGER BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
    }
}