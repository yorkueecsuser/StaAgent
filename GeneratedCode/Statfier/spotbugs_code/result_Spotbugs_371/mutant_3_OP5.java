import junit.framework.Test;

class MyTestCase2 extends MyTestCase {
  @Override
  public void setUp() {}

  @Override
  public void tearDown() {}

  @Override
  public Test suite() {
    return null;
  }

  // Introduced an unreachable switch statement
  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }

  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      int value = getValue();
      switch (value) {
        case 1:
          System.out.println("Case 1");
          break;
        case 2:
          System.out.println("Case 2");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }
  }
}