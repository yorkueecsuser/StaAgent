import junit.framework.TestCase;

class Ideas_2011_07_28 extends TestCase {

  void testWillAlwaysFail() {
    assertEquals("x", 1);

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getCondition() {
    return false;
  }
}