import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyToStringTest {
    @Test
    public void testShowBug() {
        BuggyToString buggyToString = new BuggyToString();
        String result = buggyToString.showBug();
        // TRIGGER BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        // The bug is triggered because showBug() is calling a method named tostring()
        // which does not exist as it's supposed to be toString() as per the bug rule
        assertEquals("Buggy toString method", result);
    }
}