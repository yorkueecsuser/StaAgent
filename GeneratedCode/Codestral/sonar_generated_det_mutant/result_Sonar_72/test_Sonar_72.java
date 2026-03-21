import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleBraceInitializationBugTest {
    @Test
    public void testShowBug() {
        DoubleBraceInitializationBug buggyClass = new DoubleBraceInitializationBug();
        // TRIGGER BUG: Double Brace Initialization should not be used
        buggyClass.showBug().get("firstName");
        buggyClass.showBug().get("lastName");
        // Since double brace initialization is being used in the showBug method,
        // this test will cause the bug to be triggered as the test will create a new HashMap instance each time the showBug method is called.
    }
}