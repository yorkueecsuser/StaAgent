import javax.annotation.concurrent.ThreadSafe;

class OurThreadUtils {
  static native boolean isMainThread();

  static void assertMainThread() {}

  static void assertHoldsLock(Object lock) {}
}

class OurThreadUtil {
  /*This is like AndroidThreadUtil*/
  static native boolean isUiThread();

  static void assertOnUiThread() {}

  static void assertOnBackgroundThread() {}
}

@ThreadSafe
class RaceWithMainThread {

  Integer f;

  void main_thread_OK() {
    OurThreadUtils.assertMainThread();
    f = 88;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      f = 99;
    }
  }

  Integer f1;

  void main_thread1_OK() {
    OurThreadUtil.assertOnUiThread();
    f1 = 88;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      f1 = 99;
    }
  }

  void main_thread_indirect_OK() {
    main_thread_OK();
    f = 77;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      f = 88;
    }
  }

  void read_from_main_thread_OK() {
    Integer x;
    OurThreadUtils.assertMainThread();
    x = f;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      x = 99;
    }
  }

  void read_unprotected_unthreaded_Bad() {
    Integer x;
    x = f;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      x = 99;
    }
  }

  void read_unprotected_unthreaded1_Bad() {
    Integer x;
    x = f1;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      x = 99;
    }
  }

  /*There is a particularly subtle idiom which avoids races, where a
    variable can be read without protection on the main thread, if
    it is written with protection on the main thread and read with
    protection off. The next three methods do this safely, and the fourth
    unsafely.
  */
  Integer i;

  void protected_write_on_main_thread_OK() {
    OurThreadUtils.assertMainThread();
    synchronized (this) {
      i = 99;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      i = 88;
    }
  }

  void unprotected_read_on_main_thread_OK() {
    Integer x;
    OurThreadUtils.assertMainThread();
    x = i;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      x = 99;
    }
  }

  void protected_read_off_main_thread_OK() {
    Integer x;
    synchronized (this) {
      x = i;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      x = 99;
    }
  }

  void readProtectedUnthreadedBad() {
    Integer x;
    synchronized (this) {
      x = f;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      x = 99;
    }
  }

  Integer g;

  void holds_lock_OK() {
    OurThreadUtils.assertHoldsLock(this);
    g = 88;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      g = 99;
    }
  }

  void holds_lock_indirect_OK() {
    holds_lock_OK();
    g = 77;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      g = 99;
    }
  }

  Integer ff;

  void conditional1_Ok(boolean b) {
    if (b) {
      /*People not literally putting this assert inside if's,
      but implicitly by method calls */
      OurThreadUtils.assertMainThread();
      ff = 88;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      ff = 99;
    }
  }

  void conditional2_bad(boolean b) {
    if (b) {
      OurThreadUtils.assertMainThread();
      ff = 88;
    } else {
      ff = 99; // this might or might now run on the main thread; warn
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      ff = 88;
    }
  }

  void conditional_isMainThread_Ok() {
    if (OurThreadUtils.isMainThread()) {
      ff = 88;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      ff = 99;
    }
  }

  void conditional_isUiThread_Ok() {
    if (OurThreadUtil.isUiThread()) {
      ff = 88;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      ff = 99;
    }
  }

  void conditional_isMainThread_ElseBranch_Bad() {
    if (OurThreadUtils.isMainThread()) {
      synchronized (this) {
        ff = 88;
      }
    } else {
      ff = 99;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      ff = 88;
    }
  }

  void conditional_isUiThread_ElseBranch_Bad() {
    if (OurThreadUtil.isUiThread()) {
      synchronized (this) {
        ff = 88;
      }
    } else {
      ff = 99;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      ff = 88;
    }
  }

  void conditional_isMainThread_Negation_Bad() {
    if (!OurThreadUtils.isMainThread()) {
      ff = 88;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      ff = 99;
    }
  }

  void conditional_isMainThread_ElseBranch_Ok() {
    if (!OurThreadUtils.isMainThread()) {
      synchronized (this) {
        ff = 88;
      }
    } else {
      ff = 99;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      ff = 88;
    }
  }

  Object mFld;

  public void confusedAssertBad(boolean b) {
    if (b) {
      OurThreadUtil.assertOnBackgroundThread();
    } else {
      OurThreadUtil.assertOnUiThread();
    }
    // not sure if we're on UI or background, should report
    mFld = null;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      mFld = new Object();
    }
  }

  int mOnlyWrittenOnMain;

  private void conditionalMainThreadWrite1(boolean b) {
    if (b) {
      OurThreadUtil.assertOnUiThread();
      mOnlyWrittenOnMain = 7;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      mOnlyWrittenOnMain = 9;
    }
  }

  // make sure we don't forget what thread the callee write occurred on
  public void conditionalMainThreadWriteOk() {
    conditionalMainThreadWrite1(true);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      mOnlyWrittenOnMain = 8;
    }
  }

  int mWrittenOffMain;

  private void conditionalMainThreadWrite2(boolean b) {
    if (b) {
      OurThreadUtil.assertOnUiThread();
    } else {
      mOnlyWrittenOnMain = 7;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      mWrittenOffMain = 9;
    }
  }

  public void conditionalMainThreadWriteBad() {
    conditionalMainThreadWrite2(false);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      mWrittenOffMain = 8;
    }
  }

  int mSharedField;

  public void writeAfterConditionalMainThreadInCalleeBad() {
    conditionalMainThreadWrite1(true);
    // one branch of the callee runs on the main thread, but that doesn't mean we can assume that
    // the caller does too
    mSharedField = 7;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      mSharedField = 8;
    }
  }

  private boolean getCondition() {
    return false;
  }
}

// not marked thread-safe
class Unmarked {

  int mField;

  void writeOnUiThreadOk() {
    OurThreadUtil.assertOnUiThread();
    mField = 7;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      mField = 8;
    }
  }

  int readOnUiThreadOk() {
    OurThreadUtil.assertOnUiThread();
    return mField;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return 9;
    }
  }

  int readOffUiThreadOk() {
    // even though this read isn't known to be on the UI thread, we shouldn't assume that it occurs
    // on a background thread
    return mField;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      return 9;
    }
  }

  private boolean getCondition() {
    return false;
  }
}