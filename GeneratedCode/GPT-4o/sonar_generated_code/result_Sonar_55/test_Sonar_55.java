import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadLocalUserSessionTest {

    @Test
    public void testShowBugWithSession() {
        ThreadLocalUserSession userSession = new ThreadLocalUserSession();
        UserSession session = new UserSession() {
            @Override
            public String getSessionInfo() {
                return "Test session info";
            }
        };

        // TRIGGER BUG: "ThreadLocal" variables should be cleaned up when no longer used
        boolean result = userSession.showBug(session);

        // The following assertion is expected to fail due to the bug in the showBug method
        assertFalse("The bug should cause memory leak issues and this test should fail", result);
    }
}