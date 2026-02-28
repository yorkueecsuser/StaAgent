// test that we can infer when code needs to be thread-safe even without annotations
class Inference {

  int mField1;

  synchronized void writeUnderLock1Ok() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    mField1 = 1;
  }

  // should report because there's a write in a method that we think can run on multiple threads
  int unprotectedRead1Bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    int ret = mField1;
    return ret;
  }

  int mField2;

  void writeUnderLock2Ok() {
    synchronized (this) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      mField2 = 2;
    }
  }

  int unprotectedRead2Bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return mField3;
  }

  void FN_writeToFieldWrittenInLockUsingMethodBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    mField3 = 3;
  }

  int mField4;
  int mField5;

  synchronized int readInsideSyncCoincidentally() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    mField4 = 4; // we will assume this needs to be protected...
    int ret = mField5; //...but not this
    return ret;
  }

  int read4OutsideSyncBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    int ret = mField4; // report
    return ret;
  }

  void write5OutsideSyncOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    mField5 = 5; // don't report
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}