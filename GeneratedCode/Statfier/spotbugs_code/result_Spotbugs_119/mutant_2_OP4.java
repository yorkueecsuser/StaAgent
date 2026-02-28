class Ideas_2009_03_16 {

  public static final Long LONG_NULL = null;

  static boolean foo(Long x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else branch
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if branch.");
      } else {
        System.out.println("This is an unreachable else branch.");
      }
    }
    return x == LONG_NULL;
  }

  static boolean foo(long x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else branch
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if branch.");
      } else {
        System.out.println("This is an unreachable else branch.");
      }
    }
    return x == LONG_NULL;
  }

  static boolean foo2(Long x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else branch
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if branch.");
      } else {
        System.out.println("This is an unreachable else branch.");
      }
    }
    return x == null;
  }

  private static boolean getCondition() {
    return true; // This ensures the if block is executed
  }

  private static boolean getUnreachableCondition() {
    return false; // This makes the inner if-else branches unreachable
  }
}