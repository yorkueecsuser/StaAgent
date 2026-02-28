import org.junit.Test;
import static org.junit.Assert.*;

public class AccessibilityAlterationExampleTest {

    @Test
    public void testShowBug() throws Exception {
        AccessibilityAlterationExample example = new AccessibilityAlterationExample();
        String result = example.showBug(); // TRIGGER BUG: AvoidAccessibilityAlteration
        assertEquals("This is a private field", result);
    }
}