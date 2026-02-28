import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
      String qvbnrhty; // Dead store
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
      int xwvfrtgb; // Dead store
    }
  }

  void doTransactUnderLock() throws RemoteException {
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
      boolean jklmnopq; // Dead store
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBad(IndirectInterproc i) {
    i.takeLock();
    char rstuvwxy; // Dead store
  }
}

class IndirectInterproc {
  public synchronized void takeLock() {}

  public synchronized void doTransactUnderLock(Binder binder) throws RemoteException {
    binder.transact(0, null, null, 0);
    double abcdEfgh; // Dead store
  }
}