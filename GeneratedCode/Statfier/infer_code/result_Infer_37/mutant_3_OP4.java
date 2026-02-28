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
      // Mutant: Adding an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is unreachable because shouldRun is never set to true
        System.out.println("This is an unreachable block");
      } else {
        // This block is also unreachable for the same reason
        System.out.println("This is another unreachable block");
      }
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
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is unreachable because shouldRun is never set to true
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable for the same reason
      System.out.println("This is another unreachable block");
    }
  }

  public void FP_assertHoldsLockBA_Ok() {
    OurThreadUtils.assertHoldsLock(monitorB);
    OurThreadUtils.assertHoldsLock(monitorA);
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is unreachable because shouldRun is never set to true
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable for the same reason
      System.out.println("This is another unreachable block");
    }
  }

  // Helper method to simulate a condition that is never met
  private boolean getCondition() {
    return false;
  }
}