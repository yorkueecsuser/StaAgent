import org.junit.Test;
import static org.junit.Assert.*;

public class RegexPossessiveBugTest {
    @Test
    public void testBug() {
        RegexPossessiveBug bug = new RegexPossessiveBug();
        assertFalse(bug.showBug("aaabc")); // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
    }
}