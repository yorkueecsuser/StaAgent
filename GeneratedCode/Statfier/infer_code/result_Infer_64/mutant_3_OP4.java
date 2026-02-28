import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
    }
  }

  void doTransactUnderLock() throws RemoteException {
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBad(IndirectInterproc i) {
    i.takeLock();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else branch unreachable
  }
}

class IndirectInterproc {
  public synchronized void takeLock() {}

  public synchronized void doTransactUnderLock(Binder binder) throws RemoteException {
    binder.transact(0, null, null, 0);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else branch unreachable
  }
}