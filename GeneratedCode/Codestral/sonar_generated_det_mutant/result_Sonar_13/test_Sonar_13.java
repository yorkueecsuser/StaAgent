import org.junit.Test;
import static org.junit.Assert.*;

public class MyConfigurationTest {
  @Test
  public void testShowBug() {
    MyConfiguration config = new MyConfiguration();
    // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
    MyConfiguration.MyService service = config.showBug();
    assertNotNull(service);
  }
}