import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testToString() {
        BuggyClass buggyClass = new BuggyClass(null);
        assertNotNull(buggyClass.toString()); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        BuggyClass buggyClass = new BuggyClass("Test");
        assertNotNull(buggyClass.clone()); // TRIGGER BUG: "toString()" and "clone()" methods should not return null
        buggyClass.showBug(null); // Trigger bug in clone() method
    }
}