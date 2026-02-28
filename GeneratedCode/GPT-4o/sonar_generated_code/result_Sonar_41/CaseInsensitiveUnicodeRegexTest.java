import org.junit.Test;
import static org.junit.Assert.*;

public class CaseInsensitiveUnicodeRegexTest {

    @Test
    public void testShowBug() {
        CaseInsensitiveUnicodeRegex regex = new CaseInsensitiveUnicodeRegex();
        assertFalse(regex.showBug("SÖME PÄTTERN")); // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }

    @Test
    public void testShowBug2() {
        CaseInsensitiveUnicodeRegex regex = new CaseInsensitiveUnicodeRegex();
        assertFalse(regex.showBug2("SÖME PÄTTERN")); // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }

    @Test
    public void testShowBug3() {
        CaseInsensitiveUnicodeRegex regex = new CaseInsensitiveUnicodeRegex();
        assertFalse(regex.showBug3("SÖME PÄTTERN")); // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    }
}