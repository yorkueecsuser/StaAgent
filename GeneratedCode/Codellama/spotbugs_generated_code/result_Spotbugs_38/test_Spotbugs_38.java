import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyToStringTest {
    @Test
    // TRIGGER BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public void testBuggyToString() {
        BuggyToString buggyToString = new BuggyToString();
        assertEquals("This method should be named toString()", buggyToString.tostring());
    }

    @Test
    // TRIGGER BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
    public void testBuggyToStringWithError() {
        BuggyToString buggyToString = new BuggyToString();
        assertEquals("This method should be named toString()", buggyToString.tostring());
    }
}