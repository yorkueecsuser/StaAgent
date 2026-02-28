import junit.framework.TestCase;

class JunitExample extends TestCase {

  private Object mField;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mField = new Object();
    String abcdabcd = "unused"; // Dead Store mutation
  }

  public void testSomething() {
    mField.toString();
  }
}