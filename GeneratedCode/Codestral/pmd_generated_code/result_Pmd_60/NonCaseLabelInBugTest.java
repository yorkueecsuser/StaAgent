import org.junit.Test;
import static org.junit.Assert.*;

public class NonCaseLabelInBugTest {
    @Test
    public void testShowBug() {
        NonCaseLabelInBug buggyObject = new NonCaseLabelInBug();
        int result = buggyObject.showBug(1);
        assertEquals("Test failed due to NonCaseLabelInSwitch bug", 1, result);
        // TRIGGER BUG: NonCaseLabelInSwitch - The bug is triggered when the input is 1, as it falls into the non-case label'mylabel:'
    }
}