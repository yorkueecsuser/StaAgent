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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("This will never be printed");
        break;
    }
  }

  public void FN_tryLockDeadlockBA_Bad() {
    lockB.lock();
    lockA.lock(); // deadlock: `lockA` may be locked via `tryLock()` above
    lockA.unlock();
    lockB.unlock();

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("This will never be printed");
        break;
    }
  }

  // Asserting a lock is held is not the same as taking it wrt deadlocks.
  // In the following two methods, AB vs BA pattern is wrongly detected.

  Object monitorA, monitorB;

  public void FP_assertHoldsLockAB_Ok() {
    OurThreadUtils.assertHoldsLock(monitorA);
    OurThreadUtils.assertHoldsLock(monitorB);

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("This will never be printed");
        break;
    }
  }

  public void FP_assertHoldsLockBA_Ok() {
    OurThreadUtils.assertHoldsLock(monitorB);
    OurThreadUtils.assertHoldsLock(monitorA);

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("This will never be printed");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}