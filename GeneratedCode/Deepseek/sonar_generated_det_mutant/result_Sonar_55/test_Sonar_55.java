import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadLocalUserSessionTest {

    @Test
    public void testIncorrectCleanup() {
        ThreadLocalUserSession session = new ThreadLocalUserSession();
        session.incorrectCleanup(); // TRIGGER BUG: "ThreadLocal" variables should be cleaned up when no longer used
        session.showBug(); // This will trigger the bug and fail the test
    }

    @Test
    public void testShowBug1() {
        ThreadLocalUserSession session = new ThreadLocalUserSession();
        session.incorrectCleanup(); // TRIGGER BUG: "ThreadLocal" variables should be cleaned up when no longer used
        session.showBug1(); // This will trigger the bug and fail the test
    }

}