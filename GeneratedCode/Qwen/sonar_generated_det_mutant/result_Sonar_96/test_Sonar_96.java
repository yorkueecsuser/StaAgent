import org.junit.Test;
import static org.junit.Assert.*;

public class ReadReturnValueBugTest {

    @Test
    public void testShowBugTriggersBug() {
        ReadReturnValueBug bugDemo = new ReadReturnValueBug();
        String result = bugDemo.showBug("example.txt"); // TRIGGER BUG: "read" and "readLine" return values should be used
        assertEquals("", result); // This assertion will pass, but the bug is triggered in the showBug method
    }
}