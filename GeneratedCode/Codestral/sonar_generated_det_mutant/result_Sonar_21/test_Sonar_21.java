import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyMethodCallTest {

    @Test
    public void testShowBugWithNullInput() {
        BuggyMethodCall buggyMethodCall = new BuggyMethodCall();
        buggyMethodCall.showBug(null);  // TRIGGER BUG: Calls to methods should not trigger an exception
    }
}