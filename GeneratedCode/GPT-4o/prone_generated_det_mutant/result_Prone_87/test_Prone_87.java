import org.junit.Test;
import static org.junit.Assert.*;
import java.util.logging.Level;

public class LogTagBugDemoTest {

    @Test
    public void testShowBugWithLongTag() {
        LogTagBugDemo demo = new LogTagBugDemo();
        String longTag = "ThisIsAVeryLongLogTagExceedingLimit";
        demo.showBug(longTag, Level.INFO);  // TRIGGER BUG: IsLoggableTagLength
    }
}