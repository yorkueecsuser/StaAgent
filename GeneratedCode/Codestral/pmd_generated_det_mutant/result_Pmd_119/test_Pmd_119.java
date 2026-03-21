import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        // TRIGGER BUG: UseIndexOfChar
        int index = buggyCode.showBug("hello world");
        assertEquals("Bug should be triggered when 'd' is not present", -1, index);
    }
}