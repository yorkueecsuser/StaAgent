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
  }

  Integer f1;

  void main_thread1_OK() {
    OurThreadUtil.assertOnUiThread();
    f1 = 88;
  }

  void main_thread_indirect_OK() {
    main_thread_OK();
    f = 77;
  }

  void read_from_main_thread_OK() {
    Integer x;
    OurThreadUtils.assertMainThread();
    x = f;
  }

  void read_unprotected_unthreaded_Bad() {
    Integer x;
    x = f;
  }

  void read_unprotected_unthreaded1_Bad() {
    Integer x;
    x = f1;
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
  }

  void unprotected_read_on_main_thread_OK() {
    Integer x;
    OurThreadUtils.assertMainThread();
    x = i;
  }

  void protected_read_off_main_thread_OK() {
    Integer x;
    synchronized (this) {
      x = i;
    }
  }

  void readProtectedUnthreadedBad() {
    Integer x;
    synchronized (this) {
      x = f;
    }
  }

  Integer g;

  void holds_lock_OK() {
    OurThreadUtils.assertHoldsLock(this);
    g = 88;
  }

  void holds_lock_indirect_OK() {
    holds_lock_OK();
    g = 77;
  }

  Integer ff;

  void conditional1_Ok(boolean b) {
    if (b) {
      /*People not literally putting this assert inside if's,
      but implicitly by method calls */
      OurThreadUtils.assertMainThread();
      ff = 88;
    }
  }

  void conditional2_bad(boolean b) {
    if (b) {
      OurThreadUtils.assertMainThread();
      ff = 88;
    } else {
      ff = 99; // this might or might now run on the main thread; warn
    }
  }

  void conditional_isMainThread_Ok() {
    if (OurThreadUtils.isMainThread()) {
      ff = 88;
    }
  }

  void conditional_isUiThread_Ok() {
    if (OurThreadUtil.isUiThread()) {
      ff = 88;
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
  }

  void conditional_isUiThread_ElseBranch_Bad() {
    if (OurThreadUtil.isUiThread()) {
      synchronized (this) {
        ff = 88;
      }
    } else {
      ff = 99;
    }
  }

  void conditional_isMainThread_Negation_Bad() {
    if (!OurThreadUtils.isMainThread()) {
      ff = 88;
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
  }

  int mOnlyWrittenOnMain;

  private void conditionalMainThreadWrite1(boolean b) {
    if (b) {
      OurThreadUtil.assertOnUiThread();
      mOnlyWrittenOnMain = 7;
    }
  }

  // make sure we don't forget what thread the callee write occurred on
  public void conditionalMainThreadWriteOk() {
    conditionalMainThreadWrite1(true);
  }

  int mWrittenOffMain;

  private void conditionalMainThreadWrite2(boolean b) {
    if (b) {
      OurThreadUtil.assertOnUiThread();
    } else {
      mOnlyWrittenOnMain = 7;
    }
  }

  public void conditionalMainThreadWriteBad() {
    conditionalMainThreadWrite2(false);
  }

  int mSharedField;

  public void writeAfterConditionalMainThreadInCalleeBad() {
    conditionalMainThreadWrite1(true);
    // one branch of the callee runs on the main thread, but that doesn't mean we can assume that
    // the caller does too
    mSharedField = 7;
  }

  // Mutated code starts here
  Integer a;

  void main_thread_a_OK() {
    OurThreadUtils.assertMainThread();
    a = 88;
  }

  Integer b;

  void main_thread1_b_OK() {
    OurThreadUtil.assertOnUiThread();
    b = 88;
  }

  void main_thread_indirect_c_OK() {
    main_thread_a_OK();
    a = 77;
  }

  void read_from_main_thread_d_OK() {
    Integer y;
    OurThreadUtils.assertMainThread();
    y = a;
  }

  void read_unprotected_unthreaded_e_Bad() {
    Integer y;
    y = a;
  }

  void read_unprotected_unthreaded1_f_Bad() {
    Integer y;
    y = b;
  }

  Integer j;

  void protected_write_on_main_thread_g_OK() {
    OurThreadUtils.assertMainThread();
    synchronized (this) {
      j = 99;
    }
  }

  void unprotected_read_on_main_thread_h_OK() {
    Integer y;
    OurThreadUtils.assertMainThread();
    y = j;
  }

  void protected_read_off_main_thread_i_OK() {
    Integer y;
    synchronized (this) {
      y = j;
    }
  }

  void readProtectedUnthreaded_j_Bad() {
    Integer y;
    synchronized (this) {
      y = a;
    }
  }

  Integer h;

  void holds_lock_k_OK() {
    OurThreadUtils.assertHoldsLock(this);
    h = 88;
  }

  void holds_lock_indirect_l_OK() {
    holds_lock_k_OK();
    h = 77;
  }

  Integer c;

  void conditional1_m_Ok(boolean b) {
    if (b) {
      OurThreadUtils.assertMainThread();
      c = 88;
    }
  }

  void conditional2_n_bad(boolean b) {
    if (b) {
      OurThreadUtils.assertMainThread();
      c = 88;
    } else {
      c = 99;
    }
  }

  void conditional_isMainThread_o_Ok() {
    if (OurThreadUtils.isMainThread()) {
      c = 88;
    }
  }

  void conditional_isUiThread_p_Ok() {
    if (OurThreadUtil.isUiThread()) {
      c = 88;
    }
  }

  void conditional_isMainThread_q_ElseBranch_Bad() {
    if (OurThreadUtils.isMainThread()) {
      synchronized (this) {
        c = 88;
      }
    } else {
      c = 99;
    }
  }

  void conditional_isUiThread_r_ElseBranch_Bad() {
    if (OurThreadUtil.isUiThread()) {
      synchronized (this) {
        c = 88;
      }
    } else {
      c = 99;
    }
  }

  void conditional_isMainThread_s_Negation_Bad() {
    if (!OurThreadUtils.isMainThread()) {
      c = 88;
    }
  }

  void conditional_isMainThread_t_ElseBranch_Ok() {
    if (!OurThreadUtils.isMainThread()) {
      synchronized (this) {
        c = 88;
      }
    } else {
      c = 99;
    }
  }

  Object nFld;

  public void confusedAssert_u_Bad(boolean b) {
    if (b) {
      OurThreadUtil.assertOnBackgroundThread();
    } else {
      OurThreadUtil.assertOnUiThread();
    }
    nFld = null;
  }

  int nOnlyWrittenOnMain;

  private void conditionalMainThreadWrite_v(boolean b) {
    if (b) {
      OurThreadUtil.assertOnUiThread();
      nOnlyWrittenOnMain = 7;
    }
  }

  public void conditionalMainThreadWrite_w_Ok() {
    conditionalMainThreadWrite_v(true);
  }

  int nWrittenOffMain;

  private void conditionalMainThreadWrite_x(boolean b) {
    if (b) {
      OurThreadUtil.assertOnUiThread();
    } else {
      nOnlyWrittenOnMain = 7;
    }
  }

  public void conditionalMainThreadWrite_y_Bad() {
    conditionalMainThreadWrite_x(false);
  }

  int nSharedField;

  public void writeAfterConditionalMainThreadInCallee_z_Bad() {
    conditionalMainThreadWrite_v(true);
    nSharedField = 7;
  }
}

// not marked thread-safe
class Unmarked {

  int mField;

  void writeOnUiThreadOk() {
    OurThreadUtil.assertOnUiThread();
    mField = 7;
  }

  int readOnUiThreadOk() {
    OurThreadUtil.assertOnUiThread();
    return mField;
  }

  int readOffUiThreadOk() {
    return mField;
  }
}