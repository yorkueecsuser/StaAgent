import org.junit.Test;
import static org.junit.Assert.*;

public class CTest {

  @Test
  public void testInterfaceNotThreadSafe() {
    I unsafeImplementation = new I() {
      @Override
      public void bar() {
        // Intentionally left empty to simulate an unsafe implementation
      }
    };
    
    C c = new C();
    c.showBug(unsafeImplementation); // TRIGGER BUG: INTERFACE_NOT_THREAD_SAFE
  }
}