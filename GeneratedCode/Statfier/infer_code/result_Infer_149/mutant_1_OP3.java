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
    
    // Mutant code starts here
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}