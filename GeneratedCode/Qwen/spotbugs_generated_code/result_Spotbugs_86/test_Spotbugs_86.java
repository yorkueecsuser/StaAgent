import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseBugExampleTest {

    @Test
    public void testShowBugWithNonZero() {
        BitwiseBugExample example = new BitwiseBugExample();
        assertFalse(example.showBug(5)); // TRIGGER BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    }

    @Test
    public void testShowBugWithZero() {
        BitwiseBugExample example = new BitwiseBugExample();
        assertFalse(example.showBug(0)); // TRIGGER BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    }

    @Test
    public void testShowBugWithNegative() {
        BitwiseBugExample example = new BitwiseBugExample();
        assertFalse(example.showBug(-1)); // TRIGGER BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
    }
}