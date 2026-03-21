import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();
    
    @Test
    public void testShowBug_NullInput() {
        String input = null;
        String expected = "Input cannot be null";
        String actual = bugExample.showBug(input);
        assertEquals(expected, actual); // TRIGGER BUG: DangerousLiteralNull
    }
}