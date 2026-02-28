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

    // Added mutant with unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true in this context
      lockA.lock();
      lockA.unlock();
    } else {
      // This block is also unreachable for the same reason
      lockB.lock();
      lockB.unlock();
    }
  }

  public void FN_tryLockDeadlockBA_Bad() {
    lockB.lock();
    lockA.lock(); // deadlock: `lockA` may be locked via `tryLock()` above
    lockA.unlock();
    lockB.unlock();

    // Added mutant with unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true in this context
      lockA.lock();
      lockA.unlock();
    } else {
      // This block is also unreachable for the same reason
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

    // Added mutant with unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true in this context
      OurThreadUtils.assertHoldsLock(monitorA);
    } else {
      // This block is also unreachable for the same reason
      OurThreadUtils.assertHoldsLock(monitorB);
    }
  }

  public void FP_assertHoldsLockBA_Ok() {
    OurThreadUtils.assertHoldsLock(monitorB);
    OurThreadUtils.assertHoldsLock(monitorA);

    // Added mutant with unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is never set to true in this context
      OurThreadUtils.assertHoldsLock(monitorB);
    } else {
      // This block is also unreachable for the same reason
      OurThreadUtils.assertHoldsLock(monitorA);
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true under certain conditions if needed
  }
}