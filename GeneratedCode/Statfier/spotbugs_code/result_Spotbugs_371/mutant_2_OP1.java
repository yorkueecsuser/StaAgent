import junit.framework.Test;

class MyTestCase2 extends MyTestCase {
  @Override
  public void setUp() {
    // Dead store mutation
    String jxqfvtbn = "unused";
  }

  @Override
  public void tearDown() {}

  @Override
  public Test suite() {
    return null;
  }
}