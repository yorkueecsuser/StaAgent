import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    // TRIGGER BUG: Getters and setters should access the expected fields
    public void testBuggyMethods() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.setX(10);
        assertEquals("Expected 'x' to be 10, but got a different value", 10, buggyClass.getY());
    }
}