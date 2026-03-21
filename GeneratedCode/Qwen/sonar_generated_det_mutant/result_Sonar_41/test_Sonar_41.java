import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBugWithUnicodeCase() {
        RegexBugExample example = new RegexBugExample();
        assertFalse(example.showBug("SÖME PÄTTERN")); // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }
}