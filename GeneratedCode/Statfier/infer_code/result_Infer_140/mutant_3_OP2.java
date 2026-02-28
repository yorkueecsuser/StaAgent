class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    boolean check = isMainThread();
    boolean check = isMainThread(); // Duplicated assignment statement
  }

  static void assertOnUiThread() {}

  static void assertOnBackgroundThread() {}

  static void assertHoldsLock(Object lock) {}
}