import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testFinalizeSignature() {
        BuggyClass buggyObject = new BuggyClass();
        try {
            buggyObject.showBug();
            fail("Expected an AbstractMethodError to be thrown");
        } catch (AbstractMethodError e) {
            // Expecting AbstractMethodError because of the bug
        }
    }
}