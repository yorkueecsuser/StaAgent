import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseOperationBugTest {

    @Test
    public void testShowBugWithPositiveValue() {
        BitwiseOperationBug bugDemo = new BitwiseOperationBug();
        assertEquals(0, bugDemo.showBug(16)); // TRIGGER BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
    }

    @Test
    public void testShowBugWithNegativeValue() {
        BitwiseOperationBug bugDemo = new BitwiseOperationBug();
        assertEquals(0, bugDemo.showBug(-16)); // TRIGGER BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
    }

    @Test
    public void testShowBugWithAnotherPositiveValue() {
        BitwiseOperationBug bugDemo = new BitwiseOperationBug();
        assertEquals(0, bugDemo.showBug(32)); // TRIGGER BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
    }
}