import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugTest {
    @Test
    public void testShowBug() {
        RegexBug buggyObject = new RegexBug();
        String largeInput = "a".repeat(7000);
        assertEquals("Match found", buggyObject.showBug(largeInput)); // TRIGGER BUG: Regular expressions should not overflow the stack
    }
}