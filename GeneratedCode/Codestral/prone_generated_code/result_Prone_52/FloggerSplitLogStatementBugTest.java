import org.junit.Test;
import java.util.logging.Logger;
import static org.junit.Assert.*;

public class FloggerSplitLogStatementBugTest {
    private static final Logger logger = Logger.getLogger(FloggerSplitLogStatementBugTest.class.getName());

    @Test
    public void testShowBug() {
        FloggerSplitLogStatementBug bug = new FloggerSplitLogStatementBug();
        bug.showBug();
        String logRecords = logger.getHandlers()[0].toString();
        assertTrue("Bug not triggered as expected", logRecords.contains("User ID: 123")); // TRIGGER BUG: FloggerSplitLogStatement
    }
}