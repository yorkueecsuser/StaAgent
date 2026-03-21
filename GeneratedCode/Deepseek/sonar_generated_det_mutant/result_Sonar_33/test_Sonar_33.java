import org.junit.Test;
import static org.junit.Assert.*;

public class RegexOverflowExampleTest {

    @Test
    public void testShowBug() {
        RegexOverflowExample instance = new RegexOverflowExample();
        String input = "a".repeat(8000);
        String result = instance.showBug(input);
        // TRIGGER BUG: Regular expressions should not overflow the stack
        assertNotEquals("", result);  // This test case should fail because it triggers the bug
    }
}