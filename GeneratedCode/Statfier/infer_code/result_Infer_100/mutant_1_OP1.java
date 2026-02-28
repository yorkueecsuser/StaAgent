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
    String yqjvfnxw = "deadstore"; // Dead Store Mutation
  }

  Integer f1;

  void main_thread1_OK() {
    OurThreadUtil.assertOnUiThread();
    f1 = 88;
    int vbnrhtys = 42; // Dead Store Mutation
  }

  void main_thread_indirect_OK() {
    main_thread_OK();
    f = 77;
    boolean qzxcvbnm = false; // Dead Store Mutation
  }

  void read_from_main_thread_OK() {
    Integer x;
    OurThreadUtils.assertMainThread();
    x = f;
    char wertypoi = 'a'; // Dead Store Mutation
  }

  void read_unprotected_unthreaded_Bad() {
    Integer x;
    x = f;
    long lmnopqrs = 123456789L; // Dead Store Mutation
  }

  void read_unprotected_unthreaded1_Bad() {
    Integer x;
    x = f1;
    float tghjklzx = 3.14f; // Dead Store Mutation
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
      double cvbnrhty = 2.718; // Dead Store Mutation
    }
  }

  void unprotected_read_on_main_thread_OK() {
    Integer x;
    OurThreadUtils.assertMainThread();
    x = i;
    byte jklzxcvb = 10; // Dead Store Mutation
  }

  void protected_read_off_main_thread_OK() {
    Integer x;
    synchronized (this) {
      x = i;
      short poiuytrew = 500; // Dead Store Mutation
    }
  }

  void readProtectedUnthreadedBad() {
    Integer x;
    synchronized (this) {
      x = f;
      int asdfghjk = 100; // Dead Store Mutation
    }
  }

  Integer g;

  void holds_lock_OK() {
    OurThreadUtils.assertHoldsLock(this);
    g = 88;
    String zxcvbnmq = "mutation"; // Dead Store Mutation
  }

  void holds_lock_indirect_OK() {
    holds_lock_OK();
    g = 77;
    long qwertyui = 987654321L; // Dead Store Mutation
  }

  Integer ff;

  void conditional1_Ok(boolean b) {
    if (b) {
      /*People not literally putting this assert inside if's,
      but implicitly by method calls */
      OurThreadUtils.assertMainThread();
      ff = 88;
      float poiuytrewq = 1.618f; // Dead Store Mutation
    }
  }

  void conditional2_bad(boolean b) {
    if (b) {
      OurThreadUtils.assertMainThread();
      ff = 88;
      double lkjhgfds = 0.577; // Dead Store Mutation
    } else {
      ff = 99; // this might or might now run on the main thread; warn
      char mnpoiuyt = 'b'; // Dead Store Mutation
    }
  }

  void conditional_isMainThread_Ok() {
    if (OurThreadUtils.isMainThread()) {
      ff = 88;
      boolean cvbnrhty = true; // Dead Store Mutation
    }
  }

  void conditional_isUiThread_Ok() {
    if (OurThreadUtil.isUiThread()) {
      ff = 88;
      int yuiopasd = 200; // Dead Store Mutation
    }
  }

  void conditional_isMainThread_ElseBranch_Bad() {
    if (OurThreadUtils.isMainThread()) {
      synchronized (this) {
        ff = 88;
        long zxcvbnml = 6789012345L; // Dead Store Mutation
      }
    } else {
      ff = 99;
      short asdfghjk = 300; // Dead Store Mutation
    }
  }

  void conditional_isUiThread_ElseBranch_Bad() {
    if (OurThreadUtil.isUiThread()) {
      synchronized (this) {
        ff = 88;
        float poiuytrew = 0.314f; // Dead Store Mutation
      }
    } else {
      ff = 99;
      double lkjhgfds = 0.707; // Dead Store Mutation
    }
  }

  void conditional_isMainThread_Negation_Bad() {
    if (!OurThreadUtils.isMainThread()) {
      ff = 88;
      byte mnpoiuyt = 5; // Dead Store Mutation
    }
  }

  void conditional_isMainThread_ElseBranch_Ok() {
    if (!OurThreadUtils.isMainThread()) {
      synchronized (this) {
        ff = 88;
        char zxcvbnml = 'c'; // Dead Store Mutation
      }
    } else {
      ff = 99;
      int asdfghjk = 400; // Dead Store Mutation
    }
  }

  Object mFld;

  public void confusedAssertBad(boolean b) {
    if (b) {
      OurThreadUtil.assertOnBackgroundThread();
      String qwertyui = "background"; // Dead Store Mutation
    } else {
      OurThreadUtil.assertOnUiThread();
      int asdfghjk = 500; // Dead Store Mutation
    }
    // not sure if we're on UI or background, should report
    mFld = null;
    long zxcvbnml = 1234567890L; // Dead Store Mutation
  }

  int mOnlyWrittenOnMain;

  private void conditionalMainThreadWrite1(boolean b) {
    if (b) {
      OurThreadUtil.assertOnUiThread();
      mOnlyWrittenOnMain = 7;
      double poiuytrew = 1.414; // Dead Store Mutation
    }
  }

  // make sure we don't forget what thread the callee write occurred on
  public void conditionalMainThreadWriteOk() {
    conditionalMainThreadWrite1(true);
    char zxcvbnml = 'd'; // Dead Store Mutation
  }

  int mWrittenOffMain;

  private void conditionalMainThreadWrite2(boolean b) {
    if (b) {
      OurThreadUtil.assertOnUiThread();
      float poiuytrew = 0.577f; // Dead Store Mutation
    } else {
      mOnlyWrittenOnMain = 7;
      long zxcvbnml = 987654321L; // Dead Store Mutation
    }
  }

  public void conditionalMainThreadWriteBad() {
    conditionalMainThreadWrite2(false);
    int asdfghjk = 600; // Dead Store Mutation
  }

  int mSharedField;

  public void writeAfterConditionalMainThreadInCalleeBad() {
    conditionalMainThreadWrite1(true);
    // one branch of the callee runs on the main thread, but that doesn't mean we can assume that
    // the caller does too
    mSharedField = 7;
    boolean qwertyui = false; // Dead Store Mutation
  }
}

// not marked thread-safe
class Unmarked {

  int mField;

  void writeOnUiThreadOk() {
    OurThreadUtil.assertOnUiThread();
    mField = 7;
    String asdfghjk = "unmarked"; // Dead Store Mutation
  }

  int readOnUiThreadOk() {
    OurThreadUtil.assertOnUiThread();
    return mField;
    char zxcvbnml = 'e'; // Dead Store Mutation
  }

  int readOffUiThreadOk() {
    // even though this read isn't known to be on the UI thread, we shouldn't assume that it occurs
    // on a background thread
    return mField;
    int poiuytrew = 700; // Dead Store Mutation
  }
}