import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyLoggerTest {
    @Test
    public void showBugTest() {
        BuggyLogger buggyLogger = new BuggyLogger();
        buggyLogger.showBug();  // TRIGGER BUG: IsLoggableTagLength
    }
}