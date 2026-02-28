import junit.framework.Test;

class MyTestCase2 extends MyTestCase {
  @Override
  public void setUp() {}

  @Override
  public void tearDown() {}

  @Override
  public Test suite() {
    return null;
  }

  // Mutated code
  private int a;

  public void exampleMethod() {
    int b = 10;
    a = b + 5;
  }
}