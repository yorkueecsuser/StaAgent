import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleBraceInitializationBugTest {

    @Test
    public void testShowBug() {
        DoubleBraceInitializationBug bugDemo = new DoubleBraceInitializationBug();
        bugDemo.showBug(); // TRIGGER BUG: DoubleBraceInitialization
        assertTrue(bugDemo.initializeList().contains("Sweden")); // This will fail because the list does not contain "Sweden" at index 0
    }
}