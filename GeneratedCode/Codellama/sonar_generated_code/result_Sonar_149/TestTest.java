import org.junit.Test;
import static org.junit.Assert.*;

public class Test {
  @Test
  public void test() {
    Test test = new Test();
    test.execute(test.getClass().getMethod("execute", Method.class));
    // TRIGGER BUG: Reflection should not be used to check non-runtime annotations
    assertTrue(test.isAnnotationPresent(Override.class));
  }

  public static void main(String[] args) {
    Test test = new Test();
    test.execute(test.getClass().getMethod("execute", Method.class));
  }
}