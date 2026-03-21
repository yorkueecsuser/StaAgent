import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexPossessiveQuantifierDemoTest {

    @Test
    public void testShowBug1() {
        RegexPossessiveQuantifierDemo demo = new RegexPossessiveQuantifierDemo();
        String input = "aaaabc";
        String result = demo.showBug1(input); // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
        assertEquals("Matched: aaaabc", result); // This assertion will fail due to the bug
    }

    @Test
    public void testShowBug2() {
        RegexPossessiveQuantifierDemo demo = new RegexPossessiveQuantifierDemo();
        String input = "12345";
        String result = demo.showBug2(input); // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
        assertEquals("Matched: 2", result); // This assertion will fail due to the bug
    }
}