import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {

  @Test
  public void testShowBug() {
    MainClass mainClass = new MainClass();
    assertNotNull(mainClass.showBug());  // TRIGGER BUG: "@NonNull" values should not be set to null
  }

  @Test
  public void testShowBug2() {
    MainClass mainClass = new MainClass(null);
    assertNotNull(mainClass.showBug2());  // TRIGGER BUG: "@NonNull" values should not be set to null
  }

  @Test
  public void testShowBug3() {
    MainClass mainClass = new MainClass();
    assertNotNull(mainClass.showBug3());  // TRIGGER BUG: "@NonNull" values should not be set to null
  }
}