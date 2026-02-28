import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void testShowBug1WithNull() {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug1(null); // TRIGGER BUG: "@NonNull" values should not be set to null
    }

    @Test
    public void testShowBug2() {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug2(); // TRIGGER BUG: "@NonNull" values should not be set to null
    }

    @Test
    public void testShowBug3() {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug3(); // TRIGGER BUG: "@NonNull" values should not be set to null
    }

    @Test
    public void testShowBug() {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug(null); // TRIGGER BUG: "@NonNull" values should not be set to null
    }
}