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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
    } else {
      // This block is unreachable
      System.out.println("This is an unreachable block");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
    } else {
      // This block is unreachable
      System.out.println("This is another unreachable block");
    }
  }

  private static boolean getCondition() {
    return true; // Always returns true to ensure the if block is reachable
  }
}