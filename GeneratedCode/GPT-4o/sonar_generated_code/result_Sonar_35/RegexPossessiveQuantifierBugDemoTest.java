import org.junit.Test;
import static org.junit.Assert.*;

public class RegexPossessiveQuantifierBugDemoTest {

    @Test
    public void testShowBug1() {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        String result = demo.showBug1("aaaabc");
        assertEquals("Matched: aaaabc", result); // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
    }

    @Test
    public void testShowBug2() {
        RegexPossessiveQuantifierBugDemo demo = new RegexPossessiveQuantifierBugDemo();
        String result = demo.showBug2("123456");
        assertEquals("Matched: 6", result); // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
    }
}