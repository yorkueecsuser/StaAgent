import junit.framework.Test;
import junit.framework.TestCase;

public abstract class MyTestCase extends TestCase {
  @Override
  public void setUp() {
    int dummy = 0; // Original assignment statement
    int dummy = 0; // Duplicated assignment statement
  }

  @Override
  public void tearDown() {}

  public Test suite() {
    return null;
  }
}