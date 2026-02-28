import org.junit.Test;
import static org.junit.Assert.*;

public class OctalValueBugExampleTest {
  
  @Test
  public void testBug() {
    OctalValueBugExample obj = new OctalValueBugExample();
    int result = obj.showBug(0);
    assertEquals(0x100, result); // TRIGGER BUG: AvoidUsingOctalValues
  }
}