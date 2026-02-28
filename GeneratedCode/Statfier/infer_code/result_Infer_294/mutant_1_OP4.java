// test that we can infer when code needs to be thread-safe even without annotations
class Inference {

  int mField1;

  synchronized void writeUnderLock1Ok() {
    mField1 = 1;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      mField1 = 99;
    } else {
      // Another code that should never run
      mField1 = 88;
    }
  }

  // should report because there's a write in a method that we think can run on multiple threads
  int unprotectedRead1Bad() {
    int ret = mField1;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      ret = 99;
    } else {
      // Another code that should never run
      ret = 88;
    }
    return ret;
  }

  int mField2;

  void writeUnderLock2Ok() {
    synchronized (this) {
      mField2 = 2;
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never run
        mField2 = 99;
      } else {
        // Another code that should never run
        mField2 = 88;
      }
    }
  }

  int unprotectedRead2Bad() {
    int ret = mField2;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      ret = 99;
    } else {
      // Another code that should never run
      ret = 88;
    }
    return ret;
  }

  // TODO: handle these casely separately, since assuming that any method whose (transitive) callee
  // uses a lock can run on multiple threads may cause a lot of false positives
  int mField3;

  // empty call that uses a lock
  private synchronized void useLock() {}

  int useLockInCalleeThenReadBad() {
    useLock();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      mField3 = 99;
    } else {
      // Another code that should never run
      mField3 = 88;
    }
    return mField3;
  }

  void FN_writeToFieldWrittenInLockUsingMethodBad() {
    mField3 = 3;
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      mField3 = 99;
    } else {
      // Another code that should never run
      mField3 = 88;
    }
  }

  int mField4;
  int mField5;

  synchronized int readInsideSyncCoincidentally() {
    mField4 = 4; // we will assume this needs to be protected...
    int ret = mField5; //...but not this
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      ret = 99;
    } else {
      // Another code that should never run
      ret = 88;
    }
    return ret;
  }

  int read4OutsideSyncBad() {
    int ret = mField4; // report
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      ret = 99;
    } else {
      // Another code that should never run
      ret = 88;
    }
    return ret;
  }

  void write5OutsideSyncOk() {
    mField5 = 5; // don't report
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      mField5 = 99;
    } else {
      // Another code that should never run
      mField5 = 88;
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}