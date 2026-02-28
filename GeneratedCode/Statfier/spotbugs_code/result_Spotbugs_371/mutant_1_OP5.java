import junit.framework.Test;

class MyTestCase2 extends MyTestCase {
  @Override
  public void setUp() {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  @Override
  public void tearDown() {}

  @Override
  public Test suite() {
    return null;
  }

  private boolean getCondition() {
    return false;
  }
}