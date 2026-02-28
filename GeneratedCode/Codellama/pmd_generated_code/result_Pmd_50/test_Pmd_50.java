import org.junit.Test;
import static org.junit.Assert.*;
import java.util.logging.Logger;

class InvalidLogMessageFormatTest {
    private static final Logger LOGGER = Logger.getLogger(InvalidLogMessageFormatTest.class.getName());

    @Test
    public void testShowBug() {
        String[] args = new String[] {"arg1", "arg2"};
        InvalidLogMessageFormat invalidLogMessageFormat = new InvalidLogMessageFormat();
        invalidLogMessageFormat.showBug(args);
        // TRIGGER BUG: InvalidLogMessageFormat
        assertEquals("Log message with 1 placeholders but 2 arguments", LOGGER.info("Log message with {} placeholders but {} arguments", 1, args.length));
    }
}