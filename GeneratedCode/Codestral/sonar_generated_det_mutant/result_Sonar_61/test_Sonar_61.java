import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testBuggyClass() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.showBug();

        // TRIGGER BUG: Getters and setters should access the expected fields
        // The expected output is "Expected x to be 5, but got: 5"
        // and "Expected y to be 5, but got: 0"
        // However, due to the bug in the code, the actual output is "Expected x to be 5, but got: 0"
        // and "Expected y to be 5, but got: 5", causing the test to fail.
        assertEquals(5, buggyClass.getY());
    }
}