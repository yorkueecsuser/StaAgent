import org.junit.Test;
import static org.junit.Assert.*;

public class SerializableClassTest {

  @Test
  public void testBug() {
    SerializableClass serializableClass = new SerializableClass(1);
    // TRIGGER BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
    assertEquals(1, serializableClass.field3);
  }
}