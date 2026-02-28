import org.junit.Test;
import static org.junit.Assert.*;

public class UnusedAnonymousClassBugTest {
    @Test
    public void testBugTrigger() {
        UnusedAnonymousClassBug.showBug(); // TRIGGER BUG: UnusedAnonymousClass
    }
}