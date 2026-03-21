import org.junit.Test;
import static org.junit.Assert.*;

public class RegExBugTest {

    private RegExBug regExBug = new RegExBug();

    @Test // TRIGGER BUG: Regular expressions should be syntactically valid
    public void testShowBug() {
        try {
            regExBug.showBug();
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException anIllegalArgumentException) {
            // expected
        }
    }
}