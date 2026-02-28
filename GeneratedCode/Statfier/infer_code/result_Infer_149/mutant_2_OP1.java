import junit.framework.TestCase;

class JunitExample extends TestCase {

  private Object mField;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mField = new Object();
    // Dead store mutation
    String abcdefgh = "unusedVariable";
  }

  public void testSomething() {
    mField.toString();
    // Dead store mutation
    int hijklmno = 42;
  }
}