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
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // unreachable while loop
      }
    }
    try {
      return x(a - 5);
    } catch (Exception e) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // unreachable while loop
      }
    }
    try {
      return x(-a);
    } catch (Exception e) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // unreachable while loop
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    try {
      x(0);
    } catch (Exception e1) {
      // nothing here - should be flagged
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // unreachable while loop
      }
    } finally {
      try {
        x(1);
      } catch (Exception e2) {
        // nothing here - should also be flagged
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // unreachable while loop
        }
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the loops are unreachable
  }
}