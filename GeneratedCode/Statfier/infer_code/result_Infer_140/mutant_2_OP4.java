class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    // Inserting unreachable if-else statement
    boolean shouldRun = isMainThread(); // Using a dynamic condition
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun being dynamically determined
      System.out.println("This is unreachable code.");
    }
  }

  static void assertOnUiThread() {
    // Inserting unreachable if-else statement
    boolean shouldRun = isUiThread(); // Using a dynamic condition
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun being dynamically determined
      System.out.println("This is unreachable code.");
    }
  }

  static void assertOnBackgroundThread() {
    // Inserting unreachable if-else statement
    boolean shouldRun =!isMainThread(); // Using a dynamic condition
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun being dynamically determined
      System.out.println("This is unreachable code.");
    }
  }

  static void assertHoldsLock(Object lock) {
    // Inserting unreachable if-else statement
    boolean shouldRun = Thread.holdsLock(lock); // Using a dynamic condition
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun being dynamically determined
      System.out.println("This is unreachable code.");
    }
  }
}