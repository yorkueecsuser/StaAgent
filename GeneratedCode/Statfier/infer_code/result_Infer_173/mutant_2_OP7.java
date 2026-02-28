import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    b.transact(0, null, null, 0);
  }

  public void transactBad() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    doTransactOk();
  }

  public void alsoBad() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    transactBad();
  }

  private void chainOK() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    alsoBad();
  }

  Object lockA, lockB;

  private void oneWayOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (lockA) {
      synchronized (lockB) {
      }
    }
  }

  private void anotherWayOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (lockB) {
      synchronized (lockA) {
      }
    }
  }

  public void callOneWayBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    oneWayOk();
  }

  public void callAnotherWayBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    anotherWayOk();
  }

  private void callOneWayOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    oneWayOk();
  }

  private void callAnotherWayOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    anotherWayOk();
  }

  private boolean getCondition() {
    return false; // This method returns false, but it's dynamically determined at runtime
  }
}