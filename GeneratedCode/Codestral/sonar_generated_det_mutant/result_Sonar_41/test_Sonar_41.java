import org.junit.Test;
import static org.junit.Assert.*;

public class CaseInsensitiveUnicodeBugTest {
    @Test
    public void showBugTest() {
        CaseInsensitiveUnicodeBug bug = new CaseInsensitiveUnicodeBug();
        String input = "söme pättern";
        String regex = "SÖME PÄTTERN";
        // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        assertFalse(bug.showBug(input, regex));
    }
}