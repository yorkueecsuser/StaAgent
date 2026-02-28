import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    @Test
    public void showBug() {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug(); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }
}