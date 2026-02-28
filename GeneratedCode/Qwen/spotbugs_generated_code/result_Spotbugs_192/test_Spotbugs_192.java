import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBugExampleTest {

    @Test(expected = IllegalAccessException.class)
    public void testShowBugWithPrivateClass() {
        ReflectionBugExample example = new ReflectionBugExample();
        try {
            Object obj = example.showBug(PrivateClass.class); // TRIGGER BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
            assertNotNull(obj);
        } catch (InstantiationException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}