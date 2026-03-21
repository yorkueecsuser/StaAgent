import org.junit.*;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testDoSomethingWithNullArgument() {
        BugExample bugExample = new BugExample();
        try {
            bugExample.doSomething(null); // TRIGGER BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
            fail("Expected NullPointerException was not thrown");
        } catch (NullPointerException e) {
            // This is expected, do nothing
        }
    }
    
    @Test
    public void testShowBugWithNullArgument() {
        BugExample bugExample = new BugExample();
        try {
            bugExample.showBug(); // TRIGGER BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
            fail("Expected NullPointerException was not thrown");
        } catch (NullPointerException e) {
            // This is expected, do nothing
        }
    }
}