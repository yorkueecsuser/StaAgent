import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
        RegexBug.showBug();
    }
}