import org.junit.Test;
import static org.junit.Assert.*;
import java.util.logging.Logger;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class MainTest {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    @Test
    public void testShowBug() {
        Main obj = new Main();
        TestHandler testHandler = new TestHandler();
        logger.addHandler(testHandler);
        logger.setUseParentHandlers(false);

        obj.showBug();

        assertEquals("Expected log message", "Hello World!", testHandler.getLastLogMessage());
    }

    private class TestHandler extends ConsoleHandler {
        private LogRecord lastLogRecord;

        @Override
        public void publish(LogRecord record) {
            lastLogRecord = record;
        }

        public String getLastLogMessage() {
            return lastLogRecord.getMessage();
        }
    }
}