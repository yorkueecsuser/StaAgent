import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBug() {
        RegexBugExample example = new RegexBugExample();
        String input = "a.b.c";
        String expectedOutput = "a/b/c";
        String actualOutput = example.showBug(input); // TRIGGER BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testShowBug2() {
        RegexBugExample example = new RegexBugExample();
        String input = "a|b|c";
        String expectedOutput = "a,b,c";
        String actualOutput = example.showBug2(input); // TRIGGER BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        assertEquals(expectedOutput, actualOutput);
    }
}