import org.junit.Assert;
import org.junit.Test;

public class BuggyCodeTest {
    @Test
    public void testShift() {
        Assert.assertEquals(40, shift(40, 32)); // TRIGGER BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    }

    public static int shift(int value, int amount) {
        return value << amount;
    }
}