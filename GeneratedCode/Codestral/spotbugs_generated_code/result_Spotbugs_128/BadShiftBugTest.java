import org.junit.Test;
import static org.junit.Assert.*;

public class BadShiftBugTest {

    @Test
    public void testShowBugWithInvalidShiftAmount() {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32); // TRIGGER BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        assertNotEquals(1, result); // The result should not be equal to 1 as it was shifted by 32 places.
    }
}