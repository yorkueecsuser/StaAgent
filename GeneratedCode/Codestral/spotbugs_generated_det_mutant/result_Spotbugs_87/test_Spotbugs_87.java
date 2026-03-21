import org.junit.Test;
import static org.junit.Assert.*;

public class IncompatibleBitMasksBugTest {
    @Test
    public void testShowBug() {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        // TRIGGER BUG: BIT: Incompatible bit masks (BIT_IOR)
        // The assertion will fail when (e & A | B)!= C, triggering the bug
        assertTrue(bug.showBug(1, 2, 4, 0));
    }
}