import junit.framework.Test;

class MyTestCase2 extends MyTestCase {
  @Override
  public void setUp() {
    int example = 0; // Introduced assignment statement
    int example = 0; // Duplicated assignment statement
  }

  @Override
  public void tearDown() {}

  @Override
  public Test suite() {
    return null;
  }
}