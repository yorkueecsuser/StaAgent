import junit.framework.TestCase;

class Ideas_2011_07_28 extends TestCase {

  void testWillAlwaysFail() {
    assertEquals("x", 1);

    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute because shouldRun is always false
      System.out.println("This is an unreachable if block");
    } else {
      // This block should also never execute because shouldRun is always false
      System.out.println("This is an unreachable else block");
    }
  }

  private boolean getCondition() {
    return false;
  }
}