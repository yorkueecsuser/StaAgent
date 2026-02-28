import junit.framework.Test;
import junit.framework.TestCase;

public abstract class MyTestCase extends TestCase {
  @Override
  public void setUp() {
    int testVar = 0; // Original assignment
    int testVar = 0; // Duplicated assignment
  }

  @Override
  public void tearDown() {}

  public Test suite() {
    return null;
  }
}