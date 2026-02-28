import org.junit.Test;
import static org.junit.Assert.*;

public class MultiLoggerExampleTest {

    @Test
    public void testShowBugTriggersMoreThanOneLogger() {
        MultiLoggerExample example = new MultiLoggerExample();
        String message = "Test message";

        // This call should trigger the bug because it uses both loggers
        String result = example.showBug(message); // TRIGGER BUG: MoreThanOneLogger

        // This assertion will fail to demonstrate the bug
        assertEquals("Logged message: Test message", result); // We expect this to pass, but it's part of demonstrating the bug
    }
}