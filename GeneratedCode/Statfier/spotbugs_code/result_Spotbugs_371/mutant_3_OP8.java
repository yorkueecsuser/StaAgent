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
  private String x; // New variable for mutation

  @Override
  public void setUp() {
    x = "test"; // Using the new variable in the setup method
  }

  @Override
  public void tearDown() {
    x = null; // Using the new variable in the teardown method
  }

  @Override
  public Test y() { // Renamed method to 'y' for mutation
    return null;
  }
}