import junit.framework.TestCase;

class JunitExample extends TestCase {

  private Object mField;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mField = new Object();
    mField = new Object(); // Duplicate assignment
  }

  public void testSomething() {
    mField.toString();
  }
}