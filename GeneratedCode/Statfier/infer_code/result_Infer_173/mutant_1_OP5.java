import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    b.transact(0, null, null, 0);
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
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
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        System.out.println("This is another unreachable switch case.");
        break;
    }
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
      }
    }
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        System.out.println("This is yet another unreachable switch case.");
        break;
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
      }
    }
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        System.out.println("This is one more unreachable switch case.");
        break;
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
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        System.out.println("This is an additional unreachable switch case.");
        break;
    }
  }

  private void callAnotherWayOk() {
    anotherWayOk();
    boolean condition = getCondition();
    switch(condition) {
      case false:
        // Unreachable code
        System.out.println("This is the final unreachable switch case.");
        break;
    }
  }

  private boolean getCondition() {
    return true; // This method ensures that the switch condition is never false at runtime
  }
}