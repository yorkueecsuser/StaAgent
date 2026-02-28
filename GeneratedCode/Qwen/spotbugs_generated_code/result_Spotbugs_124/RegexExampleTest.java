import org.junit.Test;
import static org.junit.Assert.*;

public class RegexExampleTest {

    @Test
    public void testShowBug() {
        RegexExample example = new RegexExample();
        // Expected to replace "." with "/", but will not due to regex interpretation
        assertEquals("example/com", example.showBug("example.com")); // TRIGGER BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 
    }

    @Test
    public void testShowBug2() {
        RegexExample example = new RegexExample();
        // Expected to split on "|", but will not due to regex interpretation
        assertEquals("example", example.showBug2("example|com")); // TRIGGER BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN) 
    }
}