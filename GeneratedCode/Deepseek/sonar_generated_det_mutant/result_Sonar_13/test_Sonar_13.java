import org.junit.Test;
import static org.junit.Assert.*;

public class MyConfigurationTest {
  MyConfiguration myConfiguration = new MyConfiguration();

  @Test
  public void testMyService() {
    // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
    assertNotNull(myConfiguration.myService());
  }

  @Test
  public void testABetterService() {
    // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
    assertNotNull(myConfiguration.aBetterService());
  }

  @Test
  public void testAnEvenBetterService() {
    // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
    assertNotNull(myConfiguration.anEvenBetterService());
  }

  @Test
  public void testADifferentService() {
    // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
    assertNotNull(myConfiguration.aDifferentService());
  }
}