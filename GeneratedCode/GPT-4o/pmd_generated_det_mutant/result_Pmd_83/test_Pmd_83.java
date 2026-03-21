import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionLoggerTest {

    @Test
    public void testShowBug() {
        ExceptionLogger logger = new ExceptionLogger();
        
        try {
            logger.showBug(); // TRIGGER BUG: UseCorrectExceptionLogging
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            // Exception is expected due to bug in showBug method
            assertTrue(true);
        }
    }
}