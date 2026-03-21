import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyAssertionTest {
    @Test
    public void showBug_ThrowsAssertionErrorAndCatchesIt() {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        buggyAssertion.showBug(); // TRIGGER BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
    }
}