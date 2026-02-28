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
      // Some code that will run if condition is true
    } else {
      // Unreachable code due to condition always being false at runtime
    }
  }

  @WorkerThread
  void workerOk() throws RemoteException {
    doTransact();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false at runtime
    }
  }

  // WorkerThread does not propagate up the call stack
  // We don't report here, however, since this is an annotation/assertion error,
  // not starvation/deadlock.
  @UiThread
  void FN_uiThreadBad() throws RemoteException {
    workerOk();
    boolean execute = getCondition();
    if (execute) {
      // Some code that will run if execute is true
    } else {
      // Unreachable code due to execute always being false at runtime
    }
  }

  // WorkerThread wins
  @WorkerThread
  @UiThread
  void bothOk() throws RemoteException {
    workerOk();
    boolean proceed = getCondition();
    if (proceed) {
      // Some code that will run if proceed is true
    } else {
      // Unreachable code due to proceed always being false at runtime
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}