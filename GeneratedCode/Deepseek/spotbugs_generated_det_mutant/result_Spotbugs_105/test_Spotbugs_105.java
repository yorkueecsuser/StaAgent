import org.junit.Test;
import static org.junit.Assert.*;

public class IncompatibleArrayBugTest {

    private IncompatibleArrayBug bug = new IncompatibleArrayBug();

    @Test
    // TRIGGER BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    public void testShowBug() {
        assertFalse(bug.showBug()); 
    }
}