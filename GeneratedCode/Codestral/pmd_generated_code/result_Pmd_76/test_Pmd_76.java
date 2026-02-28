import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousOctalEscapeBugTest {
    @Test
    public void testShowBug() {
        SuspiciousOctalEscapeBug bug = new SuspiciousOctalEscapeBug();
        // TRIGGER BUG: SuspiciousOctalEscape
        assertEquals("suspicious: \u000C8", bug.showBug());
    }
}