import org.junit.Test;
import static org.junit.Assert.*;

public class RegexEscapeSequenceDemoTest {

    @Test
    public void testShowBugWithInvalidCharacters() {
        RegexEscapeSequenceDemo demo = new RegexEscapeSequenceDemo();
        // TRIGGER BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        assertFalse(demo.showBug("a")); // This should throw an exception due to invalid \ca
    }

    @Test
    public void testShowBugWithSymbols() {
        RegexEscapeSequenceDemo demo = new RegexEscapeSequenceDemo();
        // TRIGGER BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        assertFalse(demo.showBug("!")); // This should throw an exception due to invalid \c!
    }
}