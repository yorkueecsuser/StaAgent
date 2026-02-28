import org.junit.Test;
import static org.junit.Assert.*;

public class BitAndZeroBugTest {

    @Test
    public void testShowBugWithPositiveNumber() {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        assertEquals(0, result); // TRIGGER BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    }

    @Test
    public void testShowBugWithZero() {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(0);
        assertEquals(0, result); // TRIGGER BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    }

    @Test
    public void testShowBugWithNegativeNumber() {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(-42);
        assertEquals(0, result); // TRIGGER BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    }
}