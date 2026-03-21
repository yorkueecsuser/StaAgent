import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadLocalUserSessionTest {

    @Test
    public void testShowBug() {
        ThreadLocalUserSession session = new ThreadLocalUserSession();
        session.showBug(); // TRIGGER BUG: "ThreadLocal" variables should be cleaned up when no longer used
    }
}