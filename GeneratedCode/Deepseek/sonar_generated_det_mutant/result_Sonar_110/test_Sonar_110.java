import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    @Test
    public void testShowBug() {
        BugDemo bugDemo = new BugDemo(null);
        // TRIGGER BUG: Null pointers should not be dereferenced
        bugDemo.showBug(); // Line 7
    }
}