import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionLoggerTest {

    @Test
    public void testShowBug() {
        ExceptionLogger logger = new ExceptionLogger();
        String result = logger.showBug(); // TRIGGER BUG: UseCorrectExceptionLogging
        assertEquals("This is a test exception", result);
    }
}