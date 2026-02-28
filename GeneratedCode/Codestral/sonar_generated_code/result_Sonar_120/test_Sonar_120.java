import org.junit.Test;
import static org.junit.Assert.*;

public class IgnoredReturnValueBugTest {
    @Test
    public void testShowBug() {
        IgnoredReturnValueBug bug = new IgnoredReturnValueBug();
        String input = "HELLO";
        String result = bug.showBug(input);
        // TRIGGER BUG: Return values from functions without side effects should not be ignored
        assertNotEquals(input.toLowerCase(), result);
    }
}