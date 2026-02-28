import junit.framework.TestCase;

class JunitExample extends TestCase {

  private Object mField;
  private Object a; // Mutated variable

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mField = new Object();
    a = new Object(); // Mutated variable initialization
  }

  public void testSomething() {
    mField.toString();
    a.toString(); // Mutated variable usage
  }
}