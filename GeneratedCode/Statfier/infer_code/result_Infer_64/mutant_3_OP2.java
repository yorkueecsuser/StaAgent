import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
      expensiveLock = expensiveLock; // Mutant: duplicated assignment
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
      expensiveLock = expensiveLock; // Mutant: duplicated assignment
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
}

class IndirectInterproc {
  public synchronized void takeLock() {
    this = this; // Mutant: duplicated assignment (though 'this' is not strictly an assignment, it maintains the spirit of duplication)
  }

  public synchronized void doTransactUnderLock(Binder binder) throws RemoteException {
    binder.transact(0, null, null, 0);
  }
}