import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadLocalUserSessionTest {

    @Test
    public void testIncorrectCleanup() {
        ThreadLocalUserSession sessionManager = new ThreadLocalUserSession();
        sessionManager.showBug(); // TRIGGER BUG: "ThreadLocal" variables should be cleaned up when no longer used

        // Check that the session has been incorrectly cleaned up
        assertNull(sessionManager.get());
    }
}