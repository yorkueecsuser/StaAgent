import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test(expected = AssertionError.class)
    public void testShowBug() {
        BuggyCode bc = new BuggyCode();
        bc.showBug(); // TRIGGER BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
    }
}