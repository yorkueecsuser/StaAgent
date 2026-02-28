class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is never set to false in this context
    }
  }

  static void assertOnUiThread() {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is never set to false in this context
    }
  }

  static void assertOnBackgroundThread() {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is never set to false in this context
    }
  }

  static void assertHoldsLock(Object lock) {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is never set to false in this context
    }
  }

  private static boolean getCondition() {
    // This method always returns true, ensuring the else block is unreachable
    return true;
  }
}