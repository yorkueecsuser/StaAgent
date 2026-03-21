import org.junit.Test;
import static org.junit.Assert.*;

public class MyComponentTest {

  @Test
  public void testMyBusinessMethod() {
    MyComponent component = new MyComponent();
    assertEquals("NullPointerException caught", component.showBug()); // TRIGGER BUG: Constructor injection should be used instead of field injection
  }
}