import junit.framework.Test;
import junit.framework.TestCase;

public abstract class MyTestCase extends TestCase {
  @Override
  public void setUp() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @Override
  public void tearDown() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public Test suite() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}