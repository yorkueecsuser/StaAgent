// test that we can infer when code needs to be thread-safe even without annotations
class Inference {

  int mField1;

  synchronized void writeUnderLock1Ok() {
    mField1 = 1;
    mField1 = 1; // Mutation: duplicated assignment
  }

  // should report because there's a write in a method that we think can run on multiple threads
  int unprotectedRead1Bad() {
    int ret = mField1;
    ret = mField1; // Mutation: duplicated assignment
    return ret;
  }

  int mField2;

  void writeUnderLock2Ok() {
    synchronized (this) {
      mField2 = 2;
      mField2 = 2; // Mutation: duplicated assignment
    }
  }

  int unprotectedRead2Bad() {
    int ret = mField2;
    ret = mField2; // Mutation: duplicated assignment
    return ret;
  }

  // TODO: handle these casely separately, since assuming that any method whose (transitive) callee
  // uses a lock can run on multiple threads may cause a lot of false positives
  int mField3;

  // empty call that uses a lock
  private synchronized void useLock() {}

  int useLockInCalleeThenReadBad() {
    useLock();
    int ret = mField3;
    ret = mField3; // Mutation: duplicated assignment
    return ret;
  }

  void FN_writeToFieldWrittenInLockUsingMethodBad() {
    mField3 = 3;
    mField3 = 3; // Mutation: duplicated assignment
  }

  int mField4;
  int mField5;

  synchronized int readInsideSyncCoincidentally() {
    mField4 = 4; // we will assume this needs to be protected...
    mField4 = 4; // Mutation: duplicated assignment
    int ret = mField5; //...but not this
    return ret;
  }

  int read4OutsideSyncBad() {
    int ret = mField4; // report
    ret = mField4; // Mutation: duplicated assignment
    return ret;
  }

  void write5OutsideSyncOk() {
    mField5 = 5; // don't report
    mField5 = 5; // Mutation: duplicated assignment
  }
}