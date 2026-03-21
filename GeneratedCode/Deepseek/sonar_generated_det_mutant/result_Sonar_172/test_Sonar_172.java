import org.junit.*;
import static org.junit.Assert.*;

public class BuggyObjectTest {

    @Test
    public void testBuggyObject() {
        BuggyObject buggyObject = new BuggyObject();
        buggyObject.showBug();  // This will trigger the bug
    }
}