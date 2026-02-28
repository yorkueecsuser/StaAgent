import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class Workers {
  Binder b;

  void doTransact() throws RemoteException {
    b.transact(0, null, null, 0);
    String qzjfnxht = "unusedVariable"; // Dead store mutation
  }

  @WorkerThread
  void workerOk() throws RemoteException {
    doTransact();
    int wvbnrhty = 42; // Dead store mutation
  }

  // WorkerThread does not propagate up the call stack
  // We don't report here, however, since this is an annotation/assertion error,
  // not starvation/deadlock.
  @UiThread
  void FN_uiThreadBad() throws RemoteException {
    workerOk();
    boolean kxmtvqjf = true; // Dead store mutation
  }

  // WorkerThread wins
  @WorkerThread
  @UiThread
  void bothOk() throws RemoteException {
    workerOk();
    double rhtyuiop = 3.14; // Dead store mutation
  }
}