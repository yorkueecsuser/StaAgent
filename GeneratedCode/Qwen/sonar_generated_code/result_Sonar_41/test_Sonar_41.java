import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBugWithNonAsciiUpperCase() {
        RegexBugExample example = new RegexBugExample();
        assertFalse(example.showBug("SÖME PÄTTERN")); // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }

    @Test
    public void testShowBugWithNonAsciiLowerCase() {
        RegexBugExample example = new RegexBugExample();
        assertTrue(example.showBug("söme pättern"));
    }

    @Test
    public void testShowBugWithAsciiUpperCase() {
        RegexBugExample example = new RegexBugExample();
        assertFalse(example.showBug("SOME PATTERN")); // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }

    @Test
    public void testShowBugWithAsciiLowerCase() {
        RegexBugExample example = new RegexBugExample();
        assertTrue(example.showBug("some pattern"));
    }
}