import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    b.transact(0, null, null, 0);
  }

  public void transactBad() throws RemoteException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    doTransactOk();
  }

  public void alsoBad() throws RemoteException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    transactBad();
  }

  private void chainOK() throws RemoteException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    alsoBad();
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable if statement
        }
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable if statement
        }
      }
    }
  }

  public void callOneWayBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    oneWayOk();
  }

  public void callAnotherWayBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    anotherWayOk();
  }

  private void callOneWayOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    oneWayOk();
  }

  private void callAnotherWayOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    anotherWayOk();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but always returns false
  }
}