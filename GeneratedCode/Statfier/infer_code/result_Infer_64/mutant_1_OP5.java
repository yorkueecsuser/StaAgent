import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This is the reachable case
          System.out.println("Reachable case 1");
          break;
      }
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This is the reachable case
          System.out.println("Reachable case 1");
          break;
      }
    }
  }

  void doTransactUnderLock() throws RemoteException {
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This is the reachable case
          System.out.println("Reachable case 1");
          break;
      }
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBad(IndirectInterproc i) {
    i.takeLock();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This is the reachable case
        System.out.println("Reachable case 1");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch condition is always false, making case 0 unreachable
  }
}

class IndirectInterproc {
  public synchronized void takeLock() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This is the reachable case
        System.out.println("Reachable case 1");
        break;
    }
  }

  public synchronized void doTransactUnderLock(Binder binder) throws RemoteException {
    binder.transact(0, null, null, 0);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This is the reachable case
        System.out.println("Reachable case 1");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch condition is always false, making case 0 unreachable
  }
}