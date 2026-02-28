import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugTest {
  @Test
  public void testSynchronizationBug() {
    SynchronizationBug buggy = new SynchronizationBug();
    buggy.showBug();
    // TRIGGER BUG: "getClass" should not be used for synchronization
    assertEquals(buggy.getClass(), SynchronizationBug.class);
  }
}