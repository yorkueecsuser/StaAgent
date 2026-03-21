import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugExampleTest {

  @Test
  public void testShowBug() {
    CompareToBugExample example = new CompareToBugExample();
    int result = example.showBug(); // TRIGGER BUG: "compareTo" should not be overloaded
    assertEquals(0, result); // This assertion will fail because showBug() returns -1, not 0
  }
}