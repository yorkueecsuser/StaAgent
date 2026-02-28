import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    @Test(expected = ClassCastException.class)
    public void testShowBug() {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}