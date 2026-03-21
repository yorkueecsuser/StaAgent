import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testIsInstanceOfClass() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.buggyMethod(); // Invoke the buggy method
        assertTrue("This should pass as the bug should be triggered here", false); // TRIGGER BUG: IsInstanceOfClass
    }
}