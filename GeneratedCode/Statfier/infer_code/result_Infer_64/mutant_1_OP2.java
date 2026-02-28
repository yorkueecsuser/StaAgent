import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
    }
    // Mutant: Duplicating the synchronized block
    synchronized (expensiveLock) {
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
    }
    // Mutant: Duplicating the synchronized block
    synchronized (expensiveLock) {
    }
  }

  void doTransactUnderLock() throws RemoteException {
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
    }
    // Mutant: Duplicating the synchronized block
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBad(IndirectInterproc i) {
    i.takeLock();
    // Mutant: Duplicating the method call (though it's not an assignment, we follow the structure)
    i.takeLock();
  }
}

class IndirectInterproc {
  public synchronized void takeLock() {
    // Mutant: Duplicating the synchronized block
    synchronized (this) {
    }
  }

  public synchronized void doTransactUnderLock(Binder binder) throws RemoteException {
    binder.transact(0, null, null, 0);
    // Mutant: Duplicating the method call (though it's not an assignment, we follow the structure)
    binder.transact(0, null, null, 0);
  }
}