import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testShowBug() {
        int x = 5; // initial value of x
        int result = buggyCode.showBug(x);
        assertEquals("The bug should be triggered when method showBug returns the overwritten value", 10, result);
        // TRIGGER BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
    }
}