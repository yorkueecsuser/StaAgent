class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    // Introduced an unreachable for loop with a dynamic condition
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  static void assertOnUiThread() {
    // Introduced an unreachable for loop with a dynamic condition
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  static void assertOnBackgroundThread() {
    // Introduced an unreachable for loop with a dynamic condition
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  static void assertHoldsLock(Object lock) {
    // Introduced an unreachable for loop with a dynamic condition
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  // Helper method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}