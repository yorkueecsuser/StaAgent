// test that we can infer when code needs to be thread-safe even without annotations
class Inference {

  int mField1;

  synchronized void writeUnderLock1Ok() {
    mField1 = 1;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      mField1 = 99;
    } else {
      // Alternative code that should also never run
      mField1 = 88;
    }
  }

  // should report because there's a write in a method that we think can run on multiple threads
  int unprotectedRead1Bad() {
    int ret = mField1;
    return ret;
  }

  int mField2;

  void writeUnderLock2Ok() {
    synchronized (this) {
      mField2 = 2;
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      mField2 = 99;
    } else {
      // Alternative code that should also never run
      mField2 = 88;
    }
  }

  int unprotectedRead2Bad() {
    int ret = mField2;
    return ret;
  }

  // TODO: handle these casely separately, since assuming that any method whose (transitive) callee
  // uses a lock can run on multiple threads may cause a lot of false positives
  int mField3;

  // empty call that uses a lock
  private synchronized void useLock() {}

  int useLockInCalleeThenReadBad() {
    useLock();
    return mField3;
  }

  void FN_writeToFieldWrittenInLockUsingMethodBad() {
    mField3 = 3;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      mField3 = 99;
    } else {
      // Alternative code that should also never run
      mField3 = 88;
    }
  }

  int mField4;
  int mField5;

  synchronized int readInsideSyncCoincidentally() {
    mField4 = 4; // we will assume this needs to be protected...
    int ret = mField5; //...but not this
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      mField4 = 99;
    } else {
      // Alternative code that should also never run
      mField4 = 88;
    }
    return ret;
  }

  int read4OutsideSyncBad() {
    int ret = mField4; // report
    return ret;
  }

  void write5OutsideSyncOk() {
    mField5 = 5; // don't report
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      mField5 = 99;
    } else {
      // Alternative code that should also never run
      mField5 = 88;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, but it is not a compile-time constant
  }
}