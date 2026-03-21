import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstrationTest {

    @Test
    public void testToStringWhenEmpty() {
        BugDemonstration demo = new BugDemonstration();
        assertNotNull("toString() should not return null", demo.toString()); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
    }

    @Test
    public void testCloneWhenEmpty() throws CloneNotSupportedException {
        BugDemonstration demo = new BugDemonstration();
        assertNotNull("clone() should not return null", demo.showBugClone()); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
    }
}