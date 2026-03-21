import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyArrayToStringTest {
    BuggyArrayToString buggyArrayToString = new BuggyArrayToString();

    @Test
    public void testShowBug() {
        try {
            buggyArrayToString.showBug(); // TRIGGER BUG: ArrayToString
            fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected behaviour
        }
    }
}