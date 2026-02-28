import org.junit.Test;
import static org.junit.Assert.*;

public class LogMessageFormatBugTest {

    @Test
    public void testShowBug() {
        LogMessageFormatBug bugDemo = new LogMessageFormatBug();
        bugDemo.showBug(); // TRIGGER BUG: InvalidLogMessageFormat
    }
}