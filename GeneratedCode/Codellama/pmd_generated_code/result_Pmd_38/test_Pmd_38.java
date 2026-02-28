import org.junit.Test;
import static org.junit.Assert.*;

public class DontImportSunTest {

  @Test
  public void testBug() {
    // TRIGGER BUG: DontImportSun
    try {
      DontImportSun.main(new String[0]);
    } catch (Exception e) {
      fail("The code should not have imported sun.* packages.");
    }
  }
}