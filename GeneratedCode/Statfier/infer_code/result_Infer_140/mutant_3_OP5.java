class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  static void assertOnUiThread() {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  static void assertOnBackgroundThread() {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  static void assertHoldsLock(Object lock) {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}