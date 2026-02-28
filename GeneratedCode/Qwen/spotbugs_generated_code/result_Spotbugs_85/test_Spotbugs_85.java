import org.junit.Test;
import static org.junit.Assert.*;

public class BitMaskBugTest {

    @Test
    public void testShowBugWithIncompatibleMasks() {
        BitMaskBug bugDemo = new BitMaskBug();
        // TRIGGER BUG: BIT: Incompatible bit masks (BIT_AND)
        assertEquals(1, bugDemo.showBug(0b1100)); // This will fail because the condition (value & 0b1100) == 0b0011 is always false
    }
}