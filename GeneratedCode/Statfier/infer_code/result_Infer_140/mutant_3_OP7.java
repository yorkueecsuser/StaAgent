class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  static void assertOnUiThread() {
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  static void assertOnBackgroundThread() {
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  static void assertHoldsLock(Object lock) {
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private static boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}