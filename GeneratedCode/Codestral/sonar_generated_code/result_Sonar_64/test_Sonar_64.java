import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExceptionCreationTest {

    @Test
    public void testBugTrigger() {
        BuggyExceptionCreation buggyExceptionCreation = new BuggyExceptionCreation();
        try {
            buggyExceptionCreation.showBug(-1); // TRIGGER BUG: Exceptions should not be created without being thrown
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            fail("IllegalArgumentException should not have been caught");
        }
    }
}