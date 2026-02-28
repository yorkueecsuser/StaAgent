import org.junit.Test;
import static org.junit.Assert.*;

public class LoggerExampleTest {

    @Test
    public void testShowBug() {
        LoggerExample example = new LoggerExample();
        String result = example.showBug(); // TRIGGER BUG: ProperLogger
        assertEquals("Logged a message using a non-static logger.", result);
    }
}