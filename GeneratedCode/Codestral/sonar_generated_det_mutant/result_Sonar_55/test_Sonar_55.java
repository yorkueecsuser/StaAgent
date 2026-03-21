import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadLocalUserSessionTest {
    @Test
    public void testMemoryLeak() {
        ThreadLocalUserSession session = new ThreadLocalUserSession();
        session.showBug();
        // TRIGGER BUG: "ThreadLocal" variables should be cleaned up when no longer used
        // The bug is triggered in the showBug method when UserSession objects are not correctly cleaned up, causing a memory leak
    }
}