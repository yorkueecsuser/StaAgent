import org.junit.Test;
import static org.junit.Assert.*;

public class LogBugExampleTest {

    @Test
    public void testShowBug() {
        LogBugExample example = new LogBugExample();
        String result = example.showBug("Test Message"); // TRIGGER BUG: FloggerSplitLogStatement
        assertEquals("Test Message", result);
    }
}