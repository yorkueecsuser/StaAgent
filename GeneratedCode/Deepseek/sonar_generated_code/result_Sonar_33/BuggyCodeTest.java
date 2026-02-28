import org.junit.Test;
import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class BuggyCodeTest {
    
    // TRIGGER BUG: Regular expressions should not overflow the stack
    @Test
    public void triggerBug() {
        Pattern pattern = Pattern.compile("(a|b)*"); // Noncompliant
        Matcher matcher = pattern.matcher("a".repeat(10000));
        assertTrue(matcher.matches()); // This assertion will fail if the bug is not triggered
    }
}