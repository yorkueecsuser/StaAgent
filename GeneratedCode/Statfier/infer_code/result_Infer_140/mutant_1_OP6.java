class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    // Inserting an unreachable for loop
    boolean conditionFor = isMainThread(); // Using a method call to determine the condition
    for (int i = 0;!conditionFor; i++) {
      // This loop will never execute because conditionFor is set to the result of isMainThread()
      System.out.println("This is an unreachable loop iteration.");
    }
  }

  static void assertOnUiThread() {
    // Inserting an unreachable for loop
    boolean conditionFor = isUiThread(); // Using a method call to determine the condition
    for (int i = 0;!conditionFor; i++) {
      // This loop will never execute because conditionFor is set to the result of isUiThread()
      System.out.println("This is an unreachable loop iteration.");
    }
  }

  static void assertOnBackgroundThread() {
    // Inserting an unreachable for loop
    boolean conditionFor = isMainThread(); // Using a method call to determine the condition
    for (int i = 0; conditionFor; i++) {
      // This loop will never execute because conditionFor is set to the result of isMainThread()
      System.out.println("This is an unreachable loop iteration.");
    }
  }

  static void assertHoldsLock(Object lock) {
    // Inserting an unreachable for loop
    boolean conditionFor = Thread.holdsLock(lock); // Using a method call to determine the condition
    for (int i = 0;!conditionFor; i++) {
      // This loop will never execute because conditionFor is set to the result of Thread.holdsLock(lock)
      System.out.println("This is an unreachable loop iteration.");
    }
  }
}