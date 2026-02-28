import org.junit.Test;
import static org.junit.Assert.*;
import java.util.logging.Log;
import java.util.logging.LogFactory;

class UseCorrectExceptionLoggingTest {
    private static final Log LOG = LogFactory.getLog(UseCorrectExceptionLoggingTest.class);

    @Test
    public void testTriggerBug() {
        try {
            throw new RuntimeException("This is a bug");
        } catch (RuntimeException e) {
            LOG.error("Error occurred: " + e.getMessage());
            // BUG: UseCorrectExceptionLogging
            LOG.error("Error occurred", e);
            // TRIGGER BUG: UseCorrectExceptionLogging
            assertEquals(2, LOG.getLoggedMessages().size());
            assertTrue(LOG.getLoggedMessages().contains("Error occurred: This is a bug"));
            assertTrue(LOG.getLoggedMessages().contains("Error occurred"));
        }
    }
}