import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseBugTest {
    @Test
    public void testBug() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] mask = {0x1, 0x2, 0x4, 0x8, 0x10};
        int value = 0x100;

        // TRIGGER BUG: BIT: Incompatible bit masks (BIT_IOR)
        if ((value & mask[0]) == mask[1]) {
            fail("Value is present in the array");
        } else {
            fail("Value is not present in the array");
        }
    }
}