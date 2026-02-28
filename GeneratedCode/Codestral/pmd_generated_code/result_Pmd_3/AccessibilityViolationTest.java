import org.junit.Test;
import static org.junit.Assert.*;

public class AccessibilityViolationTest {
    @Test(expected = IllegalAccessException.class)
    public void showBugTest() throws Exception {
        AccessibilityViolation violation = AccessibilityViolation.class.newInstance();
        violation.showBug();
    }
}