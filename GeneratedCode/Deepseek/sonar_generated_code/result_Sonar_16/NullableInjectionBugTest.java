import org.junit.Test;
import static org.junit.Assert.*;

public class NullableInjectionBugTest {
  @Test
  public void testShowBug() {
    NullableInjectionBug bug = new NullableInjectionBug();
    // TRIGGER BUG: Nullable injected fields and parameters should provide a default value
    assertEquals("defaultValue", bug.showBug(null));
  }
}