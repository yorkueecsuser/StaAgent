import org.junit.Test;
import static org.junit.Assert.*;

public class LoggerExampleTest {

    @Test
    public void testShowBug() {
        LoggerExample loggerExample = new LoggerExample();
        String result = loggerExample.showBug(); // TRIGGER BUG: ProperLogger
        assertEquals("Log message shown with incorrect logger declaration.", result);
    }
}