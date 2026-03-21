import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    // The test class should extend the original class, so that we can test the original code
    private BugDemo bugDemo = new BugDemo();

    @Test
    // TRIGGER BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
    public void testShowBug() {
        String dateString = bugDemo.showBug();
        assertNotEquals("Date ", dateString);
    }
}