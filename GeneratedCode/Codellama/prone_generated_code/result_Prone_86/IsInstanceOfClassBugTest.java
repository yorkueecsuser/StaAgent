import org.junit.Test;
import static org.junit.Assert.*;

public class IsInstanceOfClassBugTest {

  @Test
  public void testIsInstanceOfClass() {
    Class<Object> clazz = Object.class;
    assertFalse(clazz.isInstance(Object.class)); // TRIGGER BUG: IsInstanceOfClass
  }

  @Test
  public void testIsAssignableFrom() {
    Class<Object> clazz = Object.class;
    assertTrue(clazz.isAssignableFrom(Object.class));
  }

  @Test
  public void testIsInstanceOfClassWithSubtype() {
    Class<Object> clazz = Object.class;
    Class<String> subtype = String.class;
    assertTrue(clazz.isAssignableFrom(subtype));
  }

  @Test
  public void testIsInstanceOfClassWithSupertype() {
    Class<String> clazz = String.class;
    Class<Object> supertype = Object.class;
    assertTrue(supertype.isAssignableFrom(clazz));
  }
}