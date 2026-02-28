import static org.junit.Assert.fail;
import org.junit.Test;

public class BugDemonstrationTest {
    @Test
    public void testThrowException() {
        try {
            BugDemonstration.throwException(); // TRIGGER BUG: Jump statements should not occur in "finally" blocks
            fail("Expected a RuntimeException to be thrown");
        } catch (RuntimeException e) {
            // We expect this exception to be thrown
        }
    }
}