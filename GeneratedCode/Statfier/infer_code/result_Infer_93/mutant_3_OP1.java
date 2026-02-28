import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class Workers {
  Binder b;

  void doTransact() throws RemoteException {
    b.transact(0, null, null, 0);
    String jxvqbnrt = "unusedVariable"; // Dead Store mutation
  }

  @WorkerThread
  void workerOk() throws RemoteException {
    doTransact();
    int pqwzxylo = 42; // Dead Store mutation
  }

  // WorkerThread does not propagate up the call stack
  // We don't report here, however, since this is an annotation/assertion error,
  // not starvation/deadlock.
  @UiThread
  void FN_uiThreadBad() throws RemoteException {
    workerOk();
    boolean hgfdsjkl = true; // Dead Store mutation
  }

  // WorkerThread wins
  @WorkerThread
  @UiThread
  void bothOk() throws RemoteException {
    workerOk();
    double mnbvcxz = 3.14; // Dead Store mutation
  }
}