import junit.framework.Test;
import junit.framework.TestCase;

public abstract class MyTestCase extends TestCase {
  @Override
  public void setUp() {
    // Dead store mutation
    String qwerasdf = "unused";
  }

  @Override
  public void tearDown() {
    // Dead store mutation
    int zxcvbnml = 42;
  }

  public Test suite() {
    return null;
  }
}