import org.junit.Test;
import static org.junit.Assert.*;

public class RegexPossessiveQuantifierBugTest {

    @Test
    public void testShowBug1() {
        RegexPossessiveQuantifierBug bugDemo = new RegexPossessiveQuantifierBug();
        String result = bugDemo.showBug1(); // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
        assertEquals("aaaabc", result); // This assertion will fail, triggering the bug
    }

    @Test
    public void testShowBug2() {
        RegexPossessiveQuantifierBug bugDemo = new RegexPossessiveQuantifierBug();
        String result = bugDemo.showBug2(); // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
        assertEquals("1234", result); // This assertion will fail, triggering the bug
    }
}