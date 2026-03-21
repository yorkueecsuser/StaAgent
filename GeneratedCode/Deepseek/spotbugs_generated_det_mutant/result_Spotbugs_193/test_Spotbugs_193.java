import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample example = new BugExample();
        try {
            // TRIGGER BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD)
            example.showBug("privateField", true);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage()); // This will fail the test if an exception is caught
        }
    }
}