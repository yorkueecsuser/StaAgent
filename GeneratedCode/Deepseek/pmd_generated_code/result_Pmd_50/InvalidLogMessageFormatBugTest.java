import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidLogMessageFormatBugTest {
    // TRIGGER BUG: InvalidLogMessageFormat
    @Test
    public void testShowBug() {
        InvalidLogMessageFormatBug bug = new InvalidLogMessageFormatBug();
        bug.showBug(); // Bug line 10, 11, 12, 13
    }
}