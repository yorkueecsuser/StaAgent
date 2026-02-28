import org.junit.Test;
import static org.junit.Assert.*;

public class IntShiftBugTest {

    @Test
    public void testShowBug() {
        IntShiftBug bugDemo = new IntShiftBug();
        assertEquals(1, bugDemo.showBug(1)); // TRIGGER BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    }

    @Test
    public void testShowBug2() {
        IntShiftBug bugDemo = new IntShiftBug();
        assertEquals(1, bugDemo.showBug2(256)); // TRIGGER BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    }
}