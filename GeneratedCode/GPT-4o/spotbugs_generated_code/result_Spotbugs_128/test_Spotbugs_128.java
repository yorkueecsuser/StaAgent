import org.junit.Test;
import static org.junit.Assert.*;

public class BitShiftBugExampleTest {

    @Test
    public void testShiftBy32() {
        BitShiftBugExample example = new BitShiftBugExample();
        int result = example.showBug(1, 32); // TRIGGER BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        assertNotEquals(0, result); // Expecting non-zero, but due to the bug, it's zero
    }

    @Test
    public void testShiftBy40() {
        BitShiftBugExample example = new BitShiftBugExample();
        int result = example.showBug(1, 40); // TRIGGER BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        assertNotEquals(256, result); // Expecting 256, but due to the bug, it's 256 (equivalent to shift by 8)
    }
}