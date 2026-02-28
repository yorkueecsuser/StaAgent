import org.junit.Test;
import static org.junit.Assert.*;

public class FloggerLogStringBugTest {
    @Test
    public void testShowBug() {
        FloggerLogStringBug bug = new FloggerLogStringBug();
        // TRIGGER BUG: FloggerLogString
        bug.showBug("JohnDoe");
    }
}