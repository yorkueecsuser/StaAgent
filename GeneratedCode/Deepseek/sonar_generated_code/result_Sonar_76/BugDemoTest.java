import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    BugDemo bugDemo = new BugDemo();

    @Test
    public void testShowBug() {
        bugDemo.showBug(); // TRIGGER BUG: Value-based classes should not be used for locking
    }
}