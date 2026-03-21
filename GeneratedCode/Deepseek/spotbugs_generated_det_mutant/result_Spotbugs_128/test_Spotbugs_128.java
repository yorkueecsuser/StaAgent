import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        assertEquals(1, Main.showBug(0)); // This line should pass
        assertEquals(2, Main.showBug(1)); // This line should pass
        // TRIGGER BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        assertEquals(1, Main.showBug(32)); // This line should fail and trigger the bug
    }
}