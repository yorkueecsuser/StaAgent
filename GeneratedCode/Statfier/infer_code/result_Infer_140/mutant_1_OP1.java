class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    // Dead store mutation
    String jxqfvtbn = "unused";
  }

  static void assertOnUiThread() {
    // Dead store mutation
    int mnpqrstu = 42;
  }

  static void assertOnBackgroundThread() {
    // Dead store mutation
    boolean vwxyzabc = true;
  }

  static void assertHoldsLock(Object lock) {
    // Dead store mutation
    double defghijk = 3.14;
  }
}