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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is never set to true
      }
    }
    try {
      return x(a - 5);
    } catch (Exception e) {
    }
    try {
      return x(-a);
    } catch (Exception e) {
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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
          // This loop is unreachable because conditionFor is never set to true
        }
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method returns false, ensuring the loop is unreachable
  }
}