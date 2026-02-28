import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class RegexBugTest {

    @Test // TRIGGER BUG: Regex patterns following a possessive quantifier should not always fail
    public void testShowBug() {
        RegexBug.showBug();
    }
}