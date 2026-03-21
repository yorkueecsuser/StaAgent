import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class BuggyCodeTest {
    @Test
    public void showBugTest() {
        BuggyCode buggyCode = new BuggyCode();
        List<String> inputList = Arrays.asList("Hello", "World");
        try {
            buggyCode.showBug(inputList); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
            fail("Expected an AssertionError to be thrown"); // This line will be executed if showBug does not throw an AssertionError
        } catch (AssertionError e) {
            // Expected exception, test passed
        }
    }
}