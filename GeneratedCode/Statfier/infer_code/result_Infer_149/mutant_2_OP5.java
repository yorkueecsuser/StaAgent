import junit.framework.TestCase;

class JunitExample extends TestCase {

  private Object mField;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mField = new Object();
    
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also not be executed due to the same reason
        System.out.println("This is also unreachable.");
        break;
    }
  }

  public void testSomething() {
    mField.toString();
  }

  private boolean getCondition() {
    return false;
  }
}