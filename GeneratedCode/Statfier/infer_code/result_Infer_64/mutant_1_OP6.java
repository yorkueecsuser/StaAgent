import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop body
      }
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop body
      }
    }
  }

  void doTransactUnderLock() throws RemoteException {
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop body
      }
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBad(IndirectInterproc i) {
    i.takeLock();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}