class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    boolean isMain = true; // Hypothetical assignment
    boolean isMain = true; // Duplicate of the hypothetical assignment
  }

  static void assertOnUiThread() {}

  static void assertOnBackgroundThread() {}

  static void assertHoldsLock(Object lock) {}
}