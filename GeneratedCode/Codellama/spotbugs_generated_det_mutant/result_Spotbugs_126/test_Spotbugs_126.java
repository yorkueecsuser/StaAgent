import org.junit.Test;
import static org.junit.Assert.*;

class RegularExpressionBugTest {
    @Test
    void testBug() {
        // TRIGGER BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
        RegularExpressionBug buggyClass = new RegularExpressionBug();
        String testString = "This is a test string with a " + File.separator + " separator.";
        assertFalse(buggyClass.showBug(testString));
    }
}