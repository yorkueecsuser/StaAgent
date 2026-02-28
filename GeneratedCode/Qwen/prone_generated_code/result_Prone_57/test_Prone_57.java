import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionalInterfaceExampleTest {

  @Test
  public void testFunctionalInterfaceMethodChanged() {
    FunctionalInterfaceExample example = new FunctionalInterfaceExample();
    String result = example.showBug(() -> "Original Value"); // TRIGGER BUG: FunctionalInterfaceMethodChanged
    assertEquals("A.bar(): Original Value, B.bar(): Original Value", result);
  }
}