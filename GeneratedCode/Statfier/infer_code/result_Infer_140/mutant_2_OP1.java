class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    // Dead store mutation
    String jkdhfslq = "unused";
  }

  static void assertOnUiThread() {
    // Dead store mutation
    int qwerasdf = 42;
  }

  static void assertOnBackgroundThread() {
    // Dead store mutation
    boolean zxcvbnm = true;
  }

  static void assertHoldsLock(Object lock) {
    // Dead store mutation
    double poiuytrew = 3.14;
  }
}