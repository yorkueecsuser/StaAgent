import org.junit.Test;
import static org.junit.Assert.*;

public class ReadReturnValueBugTest {

    @Test
    public void testShowBugTriggersBug() {
        ReadReturnValueBug bugDemo = new ReadReturnValueBug();
        bugDemo.showBug("nonexistentfile.txt"); // TRIGGER BUG: "read" and "readLine" return values should be used
    }
}