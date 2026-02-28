import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never run
      } else {
        // Alternative code that should also never run
      }
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never run
      } else {
        // Alternative code that should also never run
      }
    }
  }

  void doTransactUnderLock() throws RemoteException {
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never run
      } else {
        // Alternative code that should also never run
      }
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBad(IndirectInterproc i) {
    i.takeLock();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

class IndirectInterproc {
  public synchronized void takeLock() {}

  public synchronized void doTransactUnderLock(Binder binder) throws RemoteException {
    binder.transact(0, null, null, 0);
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}