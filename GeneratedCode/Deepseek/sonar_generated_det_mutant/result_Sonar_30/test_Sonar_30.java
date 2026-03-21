import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugTest {
    RegexBug bug = new RegexBug();

    @Test
    public void testNoncompliant1() {
        try {
            bug.noncompliant_1();
            fail("Expected an IllegalArgumentException to be thrown"); // TRIGGER BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        } catch (IllegalArgumentException e) {
            assertEquals("Illegal character range", e.getMessage());
        }
    }

    @Test
    public void testNoncompliant2() {
        try {
            bug.noncompliant_2();
            fail("Expected an IllegalArgumentException to be thrown"); // TRIGGER BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        } catch (IllegalArgumentException e) {
            assertEquals("Illegal character range", e.getMessage());
        }
    }
}