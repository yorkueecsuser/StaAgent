class DETest {
  // silly method to sometimes throw exceptions
  public static int x(int i) throws Exception {
    if (i > 0) {
      throw new Exception();
    }
    return i;
  }

  public static int f(int a) {
    try {
      return x(a);
    } catch (Exception e) {
    }
    try {
      return x(a - 5);
    } catch (Exception e) {
    }
    try {
      return x(-a);
    } catch (Exception e) {
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return 0;
  }

  public static void main(String[] args) {
    try {
      x(0);
    } catch (Exception e1) {
      // nothing here - should be flagged
    } finally {
      try {
        x(1);
      } catch (Exception e2) {
        // nothing here - should also be flagged
      }
    }
    boolean conditionWhileMain = getCondition();
    while (conditionWhileMain) {
      // Unreachable while loop
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}