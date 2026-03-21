import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main.showBug();	// TRIGGER BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
    }
}