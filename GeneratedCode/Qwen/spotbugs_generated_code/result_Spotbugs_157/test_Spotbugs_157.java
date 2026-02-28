import org.junit.Test;
import static org.junit.Assert.*;

public class MethodHidingExampleTest {

    @Test
    public void testShowBug() {
        SubClass sub = new SubClass();
        String result = sub.showBug(); // TRIGGER BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        assertEquals("Display from SubClass", result); // This assertion will fail because showBug does not return "Display from SubClass"
    }
}