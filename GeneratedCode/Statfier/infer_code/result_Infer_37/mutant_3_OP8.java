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
  }

  public void FN_tryLockDeadlockBA_Bad() {
    lockB.lock();
    lockA.lock(); // deadlock: `lockA` may be locked via `tryLock()` above
    lockA.unlock();
    lockB.unlock();
  }

  // Asserting a lock is held is not the same as taking it wrt deadlocks.
  // In the following two methods, AB vs BA pattern is wrongly detected.

  Object monitorA, monitorB;

  public void FP_assertHoldsLockAB_Ok() {
    OurThreadUtils.assertHoldsLock(monitorA);
    OurThreadUtils.assertHoldsLock(monitorB);
  }

  public void FP_assertHoldsLockBA_Ok() {
    OurThreadUtils.assertHoldsLock(monitorB);
    OurThreadUtils.assertHoldsLock(monitorA);
  }

  // Mutated code starts here

  public void FN_tryLockDeadlockAB_Bad_mutation() {
    boolean x = lockA.tryLock();
    if (x) {
      lockB.lock();
      lockB.unlock();
      lockA.unlock();
    } else {
    }
  }

  public void FN_tryLockDeadlockBA_Bad_mutation() {
    lockB.lock();
    lockA.lock(); // deadlock: `lockA` may be locked via `tryLock()` above
    lockA.unlock();
    lockB.unlock();
  }

  public void FP_assertHoldsLockAB_Ok_mutation() {
    OurThreadUtils.assertHoldsLock(monitorA);
    OurThreadUtils.assertHoldsLock(monitorB);
  }

  public void FP_assertHoldsLockBA_Ok_mutation() {
    OurThreadUtils.assertHoldsLock(monitorB);
    OurThreadUtils.assertHoldsLock(monitorA);
  }
}