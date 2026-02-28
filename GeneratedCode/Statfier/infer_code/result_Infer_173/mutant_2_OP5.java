import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    b.transact(0, null, null, 0);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case");
        break;
    }
  }

  public void transactBad() throws RemoteException {
    doTransactOk();
  }

  public void alsoBad() throws RemoteException {
    transactBad();
  }

  private void chainOK() throws RemoteException {
    alsoBad();
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is always false
            System.out.println("Unreachable case");
            break;
        }
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is always false
            System.out.println("Unreachable case");
            break;
        }
      }
    }
  }

  public void callOneWayBad() {
    oneWayOk();
  }

  public void callAnotherWayBad() {
    anotherWayOk();
  }

  private void callOneWayOk() {
    oneWayOk();
  }

  private void callAnotherWayOk() {
    anotherWayOk();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch case is unreachable
  }
}