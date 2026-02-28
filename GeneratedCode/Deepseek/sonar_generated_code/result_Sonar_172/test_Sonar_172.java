import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyFinalizeTest {

    @Test
    public void testFinalize() {
        BuggyFinalize buggy = new BuggyFinalize();
        try {
            buggy.showBug(); // TRIGGER BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
        } catch (Throwable ex) {
            fail("Exception should not have been thrown");
        }
    }
}