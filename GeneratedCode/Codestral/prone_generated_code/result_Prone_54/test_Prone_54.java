import org.junit.Test;
import static org.junit.Assert.*;

public class FormatStringBugTest {
    @Test
    public void testShowBug() {
        // Trigger the bug at line 4
        FormatStringBug.showBug(); // TRIGGER BUG: FormatString
    }
}