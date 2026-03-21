import org.junit.Test;
import static org.junit.Assert.*;

class BuggyFinallyBlockTest {
    @Test
    public void testBuggyFinallyBlock() {
        // TRIGGER BUG: DoNotThrowExceptionInFinally
        try {
            BuggyFinallyBlock.main(null);
        } catch (RuntimeException e) {
            // Expecting a RuntimeException to be thrown
            assertTrue(true);
        }
    }
}