import org.junit.Test;
import static org.junit.Assert.*;

public class CTest {

  @Test
  public void showBugTest() {
    C c = new C();
    c.showBug(); // TRIGGER BUG: INTERFACE_NOT_THREAD_SAFE
  }
}