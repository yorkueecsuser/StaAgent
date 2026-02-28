// test that we can infer when code needs to be thread-safe even without annotations
class Inference {

  int mField1;

  synchronized void writeUnderLock1Ok() {
    mField1 = 1;
    String qzjfnvxy; // Dead store mutation
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
      int kxwvbnmr; // Dead store mutation
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
    boolean rhtyujmn; // Dead store mutation
  }

  void FN_writeToFieldWrittenInLockUsingMethodBad() {
    mField3 = 3;
    char gfdlkjhg; // Dead store mutation
  }

  int mField4;
  int mField5;

  synchronized int readInsideSyncCoincidentally() {
    mField4 = 4; // we will assume this needs to be protected...
    int ret = mField5; //...but not this
    return ret;
    double vbnmlkjh; // Dead store mutation
  }

  int read4OutsideSyncBad() {
    int ret = mField4; // report
    return ret;
    float tyuiopnm; // Dead store mutation
  }

  void write5OutsideSyncOk() {
    mField5 = 5; // don't report
    long zxcvbnml; // Dead store mutation
  }
}