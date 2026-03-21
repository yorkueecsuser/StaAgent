import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    private BugDemo bugDemo;

    @Test
    // TRIGGER BUG: Conditionally executed code should be reachable
    public void testShowBug() {
        bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}