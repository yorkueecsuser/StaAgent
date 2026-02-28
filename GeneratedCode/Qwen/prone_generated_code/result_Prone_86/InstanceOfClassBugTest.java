import org.junit.Test;
import static org.junit.Assert.*;

public class InstanceOfClassBugTest {

    @Test
    public void testShowBugWithDifferentClasses() {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        assertFalse(bugDemo.showBug(String.class, Integer.class)); // TRIGGER BUG: IsInstanceOfClass
    }

    @Test
    public void testShowBugWithClassAndInteger() {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        assertFalse(bugDemo.showBug(Class.class, Integer.class)); // TRIGGER BUG: IsInstanceOfClass
    }

    @Test
    public void testShowBugWithClassAndClass() {
        InstanceOfClassBug bugDemo = new InstanceOfClassBug();
        assertTrue(bugDemo.showBug(Class.class, Class.class)); // TRIGGER BUG: IsInstanceOfClass
    }
}