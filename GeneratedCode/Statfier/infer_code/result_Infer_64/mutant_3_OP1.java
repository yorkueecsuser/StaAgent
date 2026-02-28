import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
      String qvbnrhty = "unusedVariable";
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
      int wxyzabcd = 42;
    }
  }

  void doTransactUnderLock() throws RemoteException {
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
      boolean lmnpqrst = false;
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBad(IndirectInterproc i) {
    i.takeLock();
    double efghijkl = 3.14;
  }
}

class IndirectInterproc {
  public synchronized void takeLock() {
    charmnopqr = 'x';
  }

  public synchronized void doTransactUnderLock(Binder binder) throws RemoteException {
    binder.transact(0, null, null, 0);
    long uvwxyzab = 123456789L;
  }
}