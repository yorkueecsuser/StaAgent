import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugTest {
    @Test
    public void testBug() {
        String s = "This is a test. This is a test.";
        String[] split = s.split("."); // TRIGGER BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    }
}