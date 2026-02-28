import org.junit.Test;
import static org.junit.Assert.*;

public class InstanceOfClassBugTest {

    @Test
    public void testShowBugWithDifferentClasses() {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, Integer.class); // TRIGGER BUG: IsInstanceOfClass
        assertFalse("Expected false since String is not Integer", result);
    }

    @Test
    public void testShowBugWithSameClasses() {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        boolean result = bugDemo.showBug(String.class, String.class); // TRIGGER BUG: IsInstanceOfClass
        assertTrue("Expected true since both are String", result);
    }
}