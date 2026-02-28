import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
    }
  }

  void doTransactUnderLock() throws RemoteException {
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBad(IndirectInterproc i) {
    i.takeLock();
  }

  // Mutated code
  void takeExpensiveLockOkMutant() {
    synchronized (expensiveLock) {
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBadMutant() {
    synchronized (expensiveLock) {
    }
  }

  void doTransactUnderLockMutant() throws RemoteException {
    synchronized (expensiveLock) {
      b.transact(0, null, null, 0); // Renamed 'binder' to 'b'
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBadMutant(IndirectInterproc i) {
    i.takeLock();
  }
}

class IndirectInterproc {
  public synchronized void takeLock() {}

  public synchronized void doTransactUnderLock(Binder binder) throws RemoteException {
    binder.transact(0, null, null, 0);
  }

  // Mutated code
  public synchronized void takeLockMutant() {}

  public synchronized void doTransactUnderLockMutant(Binder b) throws RemoteException { // Renamed 'binder' to 'b'
    b.transact(0, null, null, 0);
  }
}