import org.junit.Test;
import static org.junit.Assert.*;

public class CheckReturnValueBugTest {

    @Test
    public void testShowBug() {
        CheckReturnValueBug bugDemo = new CheckReturnValueBug();
        String result = bugDemo.showBug("Hello"); // TRIGGER BUG: CheckReturnValue
        assertEquals("Hello\n\n", result); // This assertion will fail, triggering the bug
    }
}