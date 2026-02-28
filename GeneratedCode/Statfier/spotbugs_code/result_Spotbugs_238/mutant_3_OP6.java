import junit.framework.TestCase;

class Ideas_2011_07_28 extends TestCase {

  void testWillAlwaysFail() {
    assertEquals("x", 1);

    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private boolean getCondition() {
    return false;
  }
}