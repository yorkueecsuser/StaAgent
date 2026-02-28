import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class IndirectBlock {
  Object expensiveLock;
  Binder binder;

  void takeExpensiveLockOk() {
    synchronized (expensiveLock) {
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This case is always executed
          System.out.println("Reachable case 1");
          break;
      }
    }
  }

  @UiThread
  void takeExpensiveLockOnUiThreadBad() {
    synchronized (expensiveLock) {
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This case is always executed
          System.out.println("Reachable case 1");
          break;
      }
    }
  }

  void doTransactUnderLock() throws RemoteException {
    synchronized (expensiveLock) {
      binder.transact(0, null, null, 0);
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This case is always executed
          System.out.println("Reachable case 1");
          break;
      }
    }
  }

  @UiThread
  void takeRemoteExpensiveLockOnUiThreadBad(IndirectInterproc i) {
    i.takeLock();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch condition is always false, making one case unreachable
  }
}

class IndirectInterproc {
  public synchronized void takeLock() {}

  public synchronized void doTransactUnderLock(Binder binder) throws RemoteException {
    binder.transact(0, null, null, 0);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch condition is always false, making one case unreachable
  }
}