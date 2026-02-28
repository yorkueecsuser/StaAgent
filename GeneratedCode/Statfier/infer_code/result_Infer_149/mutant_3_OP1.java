import junit.framework.TestCase;

class JunitExample extends TestCase {

  private Object mField;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mField = new Object();
    // Dead Store Mutation
    String abcdefgh = "somevalue";
  }

  public void testSomething() {
    mField.toString();
    // Dead Store Mutation
    int ijklmnop = 42;
  }
}