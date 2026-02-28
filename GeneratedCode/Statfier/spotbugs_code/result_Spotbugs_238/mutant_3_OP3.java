import junit.framework.TestCase;

class Ideas_2011_07_28 extends TestCase {

  void testWillAlwaysFail() {
    assertEquals("x", 1);

    // Mutant code start
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
    // Mutant code end
  }

  private boolean getCondition() {
    return false;
  }
}