import junit.framework.TestCase;

class Ideas_2011_07_28 extends TestCase {

  void testWillAlwaysFail() {
    assertEquals("x", 1);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case will also not be executed due to the same reason
        System.out.println("This is also unreachable");
        break;
    }
  }

  private boolean getCondition() {
    // This method returns false, making the switch statement unreachable
    return false;
  }
}