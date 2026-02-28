import junit.framework.Test;

class MyTestCase2 extends MyTestCase {
  @Override
  public void setUp() {
    // Dead store mutation
    String qzjfnvht = "unusedVariable";
  }

  @Override
  public void tearDown() {}

  @Override
  public Test suite() {
    return null;
  }
}