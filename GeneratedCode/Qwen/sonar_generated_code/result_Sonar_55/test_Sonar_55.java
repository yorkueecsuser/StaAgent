import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadLocalUserSessionTest {

  @Test
  public void testIncorrectCleanupCausesMemoryLeak() {
    ThreadLocalUserSession sessionManager = new ThreadLocalUserSession();
    sessionManager.showBug(); // TRIGGER BUG: "ThreadLocal" variables should be cleaned up when no longer used
    // This test will not fail due to the nature of memory leaks being hard to detect in a unit test,
    // but the comment indicates where the bug is triggered.
  }
}