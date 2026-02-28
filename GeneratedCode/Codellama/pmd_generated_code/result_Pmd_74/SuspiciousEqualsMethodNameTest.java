import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousEqualsMethodNameTest {

  @Test
  public void testEquals() {
    Person p1 = new Person("John", "Doe");
    Person p2 = new Person("Jane", "Doe");
    assertTrue(p1.equals(p2)); // TRIGGER BUG: SuspiciousEqualsMethodName
  }
}