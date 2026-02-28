import org.junit.Test;
import static org.junit.Assert.*;

public class BugsTest {
  @Test
  public void testBug() {
    // TRIGGER BUG: "runFinalizersOnExit" should not be called
    Bugs.showBug();
    fail("Expected exception to be thrown");
  }
}