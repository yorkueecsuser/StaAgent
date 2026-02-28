import org.junit.Test;
import static org.junit.Assert.*;

public class IncompatibleBitMasksBugTest {

    @Test
    public void testShowBug() {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        // TRIGGER BUG: BIT: Incompatible bit masks (BIT_AND)
        assertFalse(bug.showBug(0b0110)); // This will always return false, hence triggering the bug
    }
}