class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {}

  static void assertOnUiThread() {}

  static void assertOnBackgroundThread() {}

  static void assertHoldsLock(Object lock) {}

  // Mutated code
  static void assertMainThread(z z) {}

  static void assertOnUiThread(y y) {}

  static void assertOnBackgroundThread(x x) {}

  static void assertHoldsLock(Object l) {}
}