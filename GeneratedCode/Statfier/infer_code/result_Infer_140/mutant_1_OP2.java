class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {
    int dummy = 0; // Introduced dummy assignment
    int dummy = 0; // Duplicated assignment
  }

  static void assertOnUiThread() {
    int dummy = 1; // Introduced dummy assignment
    int dummy = 1; // Duplicated assignment
  }

  static void assertOnBackgroundThread() {
    int dummy = 2; // Introduced dummy assignment
    int dummy = 2; // Duplicated assignment
  }

  static void assertHoldsLock(Object lock) {
    int dummy = 3; // Introduced dummy assignment
    int dummy = 3; // Duplicated assignment
  }
}