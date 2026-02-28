import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class Workers {
  Binder b;

  void doTransact() throws RemoteException {
    b.transact(0, null, null, 0);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  @WorkerThread
  void workerOk() throws RemoteException {
    doTransact();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  // WorkerThread does not propagate up the call stack
  // We don't report here, however, since this is an annotation/assertion error,
  // not starvation/deadlock.
  @UiThread
  void FN_uiThreadBad() throws RemoteException {
    workerOk();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  // WorkerThread wins
  @WorkerThread
  @UiThread
  void bothOk() throws RemoteException {
    workerOk();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}