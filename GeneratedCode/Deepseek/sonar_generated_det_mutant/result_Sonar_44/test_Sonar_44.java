import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugTest {
    RegexBug obj = new RegexBug();

    @Test
    public void testRegexAlternatives() {
        // TRIGGER BUG: Regex alternatives should not be redundant
        assertEquals("Bug not triggered as expected", "a", obj.showBug());
        assertEquals("Bug not triggered as expected", "aaaaa", obj.showBug2());
    }
}