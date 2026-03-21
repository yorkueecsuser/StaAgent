import org.junit.Test;
import static org.junit.Assert.*;

public class BitMaskBugTest {

    @Test
    public void testShowBug() {
        BitMaskBug bug = new BitMaskBug();
        assertFalse(bug.showBug(0b1010)); // TRIGGER BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    @Test
    public void testShowBug1() {
        BitMaskBug bug = new BitMaskBug();
        assertFalse(bug.showBug1(0b1010)); // TRIGGER BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    @Test
    public void testShowBug2() {
        BitMaskBug bug = new BitMaskBug();
        assertFalse(bug.showBug2(0b1010)); // TRIGGER BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    @Test
    public void testShowBug3() {
        BitMaskBug bug = new BitMaskBug();
        assertTrue(bug.showBug3(0b1010));
    }
}