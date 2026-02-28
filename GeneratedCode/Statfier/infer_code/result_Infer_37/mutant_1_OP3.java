// Tests documenting FPs and FNs due to lack of sensitivity in starvation analysis

import java.util.concurrent.locks.Lock;

class LockSensitivity {
  Lock lockA, lockB;

  // In the following two methods, AB vs BA deadlock pattern
  // remains undetected since one of the locks happens via `tryLock` and result check.

  public void FN_tryLockDeadlockAB_Bad() {
    boolean locked = lockA.tryLock();
    if (locked) {
      lockB.lock();
      lockB.unlock();
      lockA.unlock();
    } else {
    }
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      lockA.lock();
      lockA.unlock();
    }
  }

  public void FN_tryLockDeadlockBA_Bad() {
    lockB.lock();
    lockA.lock(); // deadlock: `lockA` may be locked via `tryLock()` above
    lockA.unlock();
    lockB.unlock();
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      lockB.lock();
      lockB.unlock();
    }
  }

  // Asserting a lock is held is not the same as taking it wrt deadlocks.
  // In the following two methods, AB vs BA pattern is wrongly detected.

  Object monitorA, monitorB;

  public void FP_assertHoldsLockAB_Ok() {
    OurThreadUtils.assertHoldsLock(monitorA);
    OurThreadUtils.assertHoldsLock(monitorB);
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      OurThreadUtils.assertHoldsLock(monitorA);
    }
  }

  public void FP_assertHoldsLockBA_Ok() {
    OurThreadUtils.assertHoldsLock(monitorB);
    OurThreadUtils.assertHoldsLock(monitorA);
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      OurThreadUtils.assertHoldsLock(monitorB);
    }
  }

  // Helper method to simulate dynamic condition
  private boolean getCondition() {
    return false; // This method can be further modified to return dynamic values if needed
  }
}