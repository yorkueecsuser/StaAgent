import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyToStringTest {
    @Test
    public void testShowBugWithEmptyObject() {
        BuggyToString buggyObj = new BuggyToString(true); // Creating an empty object
        assertNotNull(buggyObj.showBug(true)); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
    }
}