class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() always returns false
      System.out.println("This is an unreachable statement in assertMainThread");
    }
  }

  static void assertOnUiThread() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() always returns false
      System.out.println("This is an unreachable statement in assertOnUiThread");
    }
  }

  static void assertOnBackgroundThread() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() always returns false
      System.out.println("This is an unreachable statement in assertOnBackgroundThread");
    }
  }

  static void assertHoldsLock(Object lock) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() always returns false
      System.out.println("This is an unreachable statement in assertHoldsLock");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}