import junit.framework.Test;

class MyTestCase2 extends MyTestCase {
  @Override
  public void setUp() {
    // Dead store mutation
    String xqjvbnrt = "unused";
  }

  @Override
  public void tearDown() {
    // Dead store mutation
    int wpmfkgaz = 42;
  }

  @Override
  public Test suite() {
    // Dead store mutation
    boolean rhtyujmn = true;
    return null;
  }
}