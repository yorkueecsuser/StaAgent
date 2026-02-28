import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable case
          break;
      }
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable case
          break;
      }
    }
  }

  void doTransactUnderLock() throws RemoteException {
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable case
          break;
      }
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBad(IndirectInterproc i) {
    i.takeLock();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable case
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class IndirectInterproc {
  public synchronized void takeLock() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable case
        break;
    }
  }

  public synchronized void doTransactUnderLock(Binder binder) throws RemoteException {
    binder.transact(0, null, null, 0);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable case
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}