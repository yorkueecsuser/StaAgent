import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    b.transact(0, null, null, 0);
  }

  public void transactBad() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    doTransactOk();
  }

  public void alsoBad() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    transactBad();
  }

  private void chainOK() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    alsoBad();
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }
  }

  public void callOneWayBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    oneWayOk();
  }

  public void callAnotherWayBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    anotherWayOk();
  }

  private void callOneWayOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    oneWayOk();
  }

  private void callAnotherWayOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    anotherWayOk();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but returns false
  }
}