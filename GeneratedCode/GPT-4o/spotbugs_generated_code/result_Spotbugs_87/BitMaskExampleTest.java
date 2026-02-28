import org.junit.Test;
import static org.junit.Assert.*;

public class BitMaskExampleTest {

    @Test
    public void testShowBug() {
        BitMaskExample example = new BitMaskExample();
        // The following test is expected to fail because (1 | 2) != 3
        // TRIGGER BUG: BIT: Incompatible bit masks (BIT_IOR)
        assertTrue(example.showBug(1, 2, 3)); // TRIGGER BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    @Test
    public void testShowBug2() {
        BitMaskExample example = new BitMaskExample();
        // The following test is expected to fail because ((1 & 2) | 4) != 3
        // TRIGGER BUG: BIT: Incompatible bit masks (BIT_IOR)
        assertTrue(example.showBug2(1, 2, 4, 3)); // TRIGGER BUG: BIT: Incompatible bit masks (BIT_IOR)
    }
}