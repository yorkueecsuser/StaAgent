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
      // Some code that should never run
      System.out.println("This is an unreachable if block");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block");
    }
  }

  @WorkerThread
  void workerOk() throws RemoteException {
    doTransact();
  }

  // WorkerThread does not propagate up the call stack
  // We don't report here, however, since this is an annotation/assertion error,
  // not starvation/deadlock.
  @UiThread
  void FN_uiThreadBad() throws RemoteException {
    workerOk();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in FN_uiThreadBad");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in FN_uiThreadBad");
    }
  }

  // WorkerThread wins
  @WorkerThread
  @UiThread
  void bothOk() throws RemoteException {
    workerOk();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in bothOk");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in bothOk");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}