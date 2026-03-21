import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    // TRIGGER BUG: "String.indexOf" should be used with correct ranges
    public void testShowBug() {
        try {
            BuggyCode.showBug();
            fail("Expected an StringIndexOutOfBoundsException to be thrown");
        }
        catch (StringIndexOutOfBoundsException e) {
            // Test passed
        }
    }
}