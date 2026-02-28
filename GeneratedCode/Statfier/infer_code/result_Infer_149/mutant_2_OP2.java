import junit.framework.TestCase;

class JunitExample extends TestCase {

  private Object mField;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mField = new Object();
    mField = new Object(); // Mutant: duplicated assignment statement
  }

  public void testSomething() {
    mField.toString();
  }
}