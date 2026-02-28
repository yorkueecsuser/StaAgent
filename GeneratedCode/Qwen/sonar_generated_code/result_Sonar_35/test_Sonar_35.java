import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBug1() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("aaaabc", example.showBug1()); // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
    }

    @Test
    public void testShowBug2() {
        RegexBugExample example = new RegexBugExample();
        assertEquals("1234", example.showBug2()); // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
    }
}