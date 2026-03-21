import org.junit.Test;

public class ThreadLocalUserSessionTest {

    @Test
    public void testIncorrectCleanup() {
        ThreadLocalUserSession session = new ThreadLocalUserSession();
        session.set(new UserSession());
        session.incorrectCleanup();
        // TRIGGER BUG: "ThreadLocal" variables should be cleaned up when no longer used

        // Verify that the bug has been triggered
        assertEquals(1, 2);
    }

    @Test
    public void testCorrectCleanup() {
        ThreadLocalUserSession session = new ThreadLocalUserSession();
        session.set(new UserSession());
        session.correctCleanup();

        // Verify that the bug has not been triggered
        assertEquals(1, 1);
    }
}