import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void testToStringMethod() {
        BugDemo bugDemo = new BugDemo();
        String result = bugDemo.toString(); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
        assertNotNull("toString() method should not return null", result);
    }

    @Test
    public void testCloneMethod() {
        BugDemo bugDemo = new BugDemo();
        Object cloneResult = bugDemo.clone(); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
        assertNotNull("clone() method should not return null", cloneResult);
    }

    @Test
    public void testShowBug() {
        BugDemo bugDemo = new BugDemo();
        String result = bugDemo.showBug(); // This method calls toString(); however, the internal toString should not trigger a bug here
        assertNotNull("showBug() method's toString() call should not return null", result);
    }

    @Test
    public void testShowBugClone() {
        BugDemo bugDemo = new BugDemo();
        Object cloneResult = bugDemo.showBugClone(); // This method calls clone(); however, the internal clone should not trigger a bug here
        assertNotNull("showBugClone() method's clone() call should not return null", cloneResult);
    }
}