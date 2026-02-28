import junit.framework.Test;

class MyTestCase2 extends MyTestCase {
  @Override
  public void setUp() {
    int example = 0; // Original assignment
    int example = 0; // Duplicated assignment
  }

  @Override
  public void tearDown() {}

  @Override
  public Test suite() {
    return null;
  }
}