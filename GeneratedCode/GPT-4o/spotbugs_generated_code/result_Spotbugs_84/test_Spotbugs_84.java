import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseSignBugExampleTest {

    @Test
    public void testShowBugWithNegativeConstant() {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        String result = example.showBug(5, -1); // TRIGGER BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        assertEquals("Result of bitwise check: false for val: 5 and constant: -1", result);
    }

    @Test
    public void testShowBugWithAnotherNegativeConstant() {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        String result = example.showBug(7, -2); // TRIGGER BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        assertEquals("Result of bitwise check: false for val: 7 and constant: -2", result);
    }
}