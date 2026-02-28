import junit.framework.Test;
import junit.framework.TestCase;

public abstract class MyTestCase extends TestCase {
  @Override
  public void setUp() {}

  @Override
  public void tearDown() {}

  public Test suite() {
    return null;
  }

  // Mutated code
  public Test x() {
    return null;
  }
}