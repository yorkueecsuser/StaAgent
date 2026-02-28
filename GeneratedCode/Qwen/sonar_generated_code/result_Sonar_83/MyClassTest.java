import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

class OriginalClassNameTest {

  @Test
  public void testShowBug() {
    MyClass myClass = new MyClass();
    List<String> result = myClass.showBug(); // TRIGGER BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
    assertEquals(2, result.size());
    assertTrue(result.contains("Hello"));
    assertTrue(result.contains("World"));
  }
}