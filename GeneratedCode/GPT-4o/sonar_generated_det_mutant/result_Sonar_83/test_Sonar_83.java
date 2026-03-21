import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class MyClassTest {

  @Test
  public void testShowBug() {
    MyClass myClass = new MyClass();
    List<String> result = myClass.showBug(); // TRIGGER BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
    // The following assertion is expected to fail due to the bug
    assertNotNull(result); // TRIGGER BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
    assertEquals(2, result.size()); // TRIGGER BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
    assertEquals("Hello", result.get(0)); // TRIGGER BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
    assertEquals("World", result.get(1)); // TRIGGER BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
  }
}