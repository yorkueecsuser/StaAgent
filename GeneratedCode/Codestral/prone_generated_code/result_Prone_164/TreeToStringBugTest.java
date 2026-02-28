import org.junit.Test;
import static org.junit.Assert.*;

public class TreeToStringBugTest {

    @Test
    public void buggyMethodTest() throws Exception {
        String output = new TreeToStringBug().showBug();
        // TRIGGER BUG: TreeToString
        assertFalse("Buggy code didn't trigger the expected output", output.contains("BuggyClass@"));
    }
}