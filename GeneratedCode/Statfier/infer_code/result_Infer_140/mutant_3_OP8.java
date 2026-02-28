class OurThreadUtils {
  static native boolean isMainThread();

  static native boolean isUiThread();

  static void assertMainThread() {}

  static void assertOnUiThread() {}

  static void assertOnBackgroundThread() {}

  static void assertHoldsLock(Object lock) {}

  // Mutated code
  static void assertMainThreadX() {}

  static void assertOnUiThreadY() {}

  static void assertOnBackgroundThreadZ() {}

  static void assertHoldsLockA(Object a) {}
}