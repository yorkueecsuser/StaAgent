import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBoundaryBugTest {
    @Test
    public void testBug() {
        String str = "abcdefg";
        // TRIGGER BUG: Regex boundaries should not be used in a way that can never be matched
        Pattern pattern = Pattern.compile("$[a-z]+^"); // Noncompliant
        assertFalse(pattern.matcher(str).matches());
    }
}