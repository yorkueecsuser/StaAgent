import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCloneTest {

    @Test
    public void testCloneMethod() throws CloneNotSupportedException {
        BuggyClone original = new BuggyClone(5);
        BuggyClone cloned = (BuggyClone) original.clone(); // Cloning the original object

        // TRIGGER BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        original.showBug(); // Calling showBug method that triggers the bug

        assertNotEquals(original.getValue(), cloned.getValue()); // The test will fail here as the cloned object's value is altered by the bug
    }
}