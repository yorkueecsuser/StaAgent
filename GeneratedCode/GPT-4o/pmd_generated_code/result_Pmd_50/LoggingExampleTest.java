import org.junit.Test;
import static org.junit.Assert.*;

public class LoggingExampleTest {

    @Test
    public void testShowBug() {
        LoggingExample example = new LoggingExample();
        example.showBug(); // TRIGGER BUG: InvalidLogMessageFormat
    }
}