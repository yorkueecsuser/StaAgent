class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    // Adding an unreachable switch statement
    boolean condition = isMainThread(); // Using a method call to determine the condition
    switch (condition) {
      case true:
        // This case is reachable, but the switch itself is made unreachable by the condition
        break;
      default:
        // This default case is also reachable, but the switch itself is made unreachable by the condition
        break;
    }
  }

  static void assertOnUiThread() {
    // Adding an unreachable switch statement
    boolean condition = isUiThread(); // Using a method call to determine the condition
    switch (condition) {
      case true:
        // This case is reachable, but the switch itself is made unreachable by the condition
        break;
      default:
        // This default case is also reachable, but the switch itself is made unreachable by the condition
        break;
    }
  }

  static void assertOnBackgroundThread() {
    // Adding an unreachable switch statement
    boolean condition = isMainThread(); // Using a method call to determine the condition
    switch (condition) {
      case false:
        // This case is reachable, but the switch itself is made unreachable by the condition
        break;
      default:
        // This default case is also reachable, but the switch itself is made unreachable by the condition
        break;
    }
  }

  static void assertHoldsLock(Object lock) {
    // Adding an unreachable switch statement
    boolean condition = Thread.holdsLock(lock); // Using a method call to determine the condition
    switch (condition) {
      case true:
        // This case is reachable, but the switch itself is made unreachable by the condition
        break;
      default:
        // This default case is also reachable, but the switch itself is made unreachable by the condition
        break;
    }
  }
}