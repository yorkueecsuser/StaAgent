import junit.framework.TestCase;

class JunitExample extends TestCase {

  private Object mField;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mField = new Object();
  }

  public void testSomething() {
    mField.toString();

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
      default:
        // Default case will also never be executed due to the same reason
        System.out.println("This is also unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}