import junit.framework.TestCase;

class JunitExample extends TestCase {

  private Object mField;
  private Object x; // Mutated variable

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mField = new Object();
    x = new Object(); // Mutated variable initialization
  }

  public void testSomething() {
    mField.toString();
    x.toString(); // Mutated variable usage
  }
}