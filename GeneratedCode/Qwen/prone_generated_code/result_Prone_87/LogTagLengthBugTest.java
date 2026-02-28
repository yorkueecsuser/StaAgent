import org.junit.Test;
import static org.junit.Assert.*;

public class LogTagLengthBugTest {

    @Test
    public void testShowBugWithLongTag() {
        LogTagLengthBug bugDemo = new LogTagLengthBug();
        assertFalse(bugDemo.showBug()); // TRIGGER BUG: IsLoggableTagLength
    }
}