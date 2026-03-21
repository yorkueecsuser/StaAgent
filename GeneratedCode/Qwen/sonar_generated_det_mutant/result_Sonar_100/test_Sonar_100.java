import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {

  @Test
  public void testShowBug() {
    MainClass mainClass = new MainClass();
    mainClass.showBug(); // TRIGGER BUG: "@NonNull" values should not be set to null
  }
}