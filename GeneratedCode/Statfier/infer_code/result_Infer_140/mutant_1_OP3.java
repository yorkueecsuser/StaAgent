class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    // Introduced unreachable if statement with dynamic condition
    boolean condition = isMainThread() &&!isMainThread();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  static void assertOnUiThread() {
    // Introduced unreachable if statement with dynamic condition
    boolean condition = isUiThread() &&!isUiThread();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  static void assertOnBackgroundThread() {
    // Introduced unreachable if statement with dynamic condition
    boolean condition = isMainThread() ||!isMainThread();
    if (!condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  static void assertHoldsLock(Object lock) {
    // Introduced unreachable if statement with dynamic condition
    boolean condition = Thread.holdsLock(lock) &&!Thread.holdsLock(lock);
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }
}