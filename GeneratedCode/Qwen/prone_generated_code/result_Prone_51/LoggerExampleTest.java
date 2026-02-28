import org.junit.Test;
import static org.junit.Assert.*;

public class LoggerExampleTest {

    @Test
    public void testShowBugWithOneArgument() {
        LoggerExample example = new LoggerExample();
        assertEquals("User Alice logged in with IP ", example.showBug("User %s logged in with IP %s", "Alice")); // TRIGGER BUG: FloggerLogVarargs
    }

    @Test
    public void testShowBugWithTwoArguments() {
        LoggerExample example = new LoggerExample();
        assertEquals("User Alice logged in with IP 192.168.1.1", example.showBug("User %s logged in with IP %s", "Alice", "192.168.1.1")); // TRIGGER BUG: FloggerLogVarargs
    }

    @Test
    public void testShowBugWithNoArguments() {
        LoggerExample example = new LoggerExample();
        assertEquals("User  logged in with IP ", example.showBug("User %s logged in with IP %s")); // TRIGGER BUG: FloggerLogVarargs
    }
}