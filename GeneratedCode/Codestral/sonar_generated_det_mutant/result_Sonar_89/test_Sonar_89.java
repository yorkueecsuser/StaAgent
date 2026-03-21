import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyThreadSafetyTest {

    @Test
    public void testBug() {
        BuggyThreadSafety obj = new BuggyThreadSafety();
        for (int i = 0; i < 100; i++) {
            obj.showBug();
        }
        // TRIGGER BUG: Running showBug() multiple times can reveal inconsistent behavior
        // as the getter method is synchronized but the setter is not.
    }
}