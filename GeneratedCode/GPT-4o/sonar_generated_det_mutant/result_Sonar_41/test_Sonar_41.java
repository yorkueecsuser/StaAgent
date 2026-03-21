import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBug() {
        RegexBugExample example = new RegexBugExample();
        assertTrue(example.showBug("SÖME PÄTTERN")); // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }

    @Test
    public void testShowBug2() {
        RegexBugExample example = new RegexBugExample();
        assertTrue(example.showBug2("SÖME PÄTTERN")); // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }

    @Test
    public void testShowBug3() {
        RegexBugExample example = new RegexBugExample();
        assertTrue(example.showBug3("SÖME PÄTTERN")); // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }
}