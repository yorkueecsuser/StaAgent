import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    BugDemo bugDemo = new BugDemo();

    @Test
    public void triggerBug() {
        // TRIGGER BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        String result = bugDemo.showBug(); // This line triggers the bug
        assertEquals("[1, 2, 3]", result); // This is the wrong expected result, causing the test to fail
    }
}