import org.junit.Test;
import static org.junit.Assert.*;

public class AccessibilityAlterationDemoTest {

    @Test
    public void testShowBug() {
        AccessibilityAlterationDemo demo = new AccessibilityAlterationDemo("Initial Value") {
            {
                try {
                    java.lang.reflect.Constructor<?> constructor = AccessibilityAlterationDemo.class.getDeclaredConstructor(String.class);
                    constructor.setAccessible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            @Override
            public String showBug() {
                return super.showBug();
            }
        };
        String result = demo.showBug();  // TRIGGER BUG: AvoidAccessibilityAlteration
        assertNull("Expected a bug due to accessibility alteration, resulting in null return.", result);
    }
}