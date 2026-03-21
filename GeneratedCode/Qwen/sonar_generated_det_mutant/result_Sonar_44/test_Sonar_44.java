import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testRedundantAlternatives() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("a b", example.showBug("abc")); // TRIGGER BUG: Regex alternatives should not be redundant
    }
}