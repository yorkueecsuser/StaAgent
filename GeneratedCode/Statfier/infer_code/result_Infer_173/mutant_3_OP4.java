import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    b.transact(0, null, null, 0);
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
    } else {
      // Another code that should never run
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
    if (condition) {
      // Some code that should never run
    } else {
      // Another code that should never run
    }
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean condition = getCondition();
        if (condition) {
          // Some code that should never run
        } else {
          // Another code that should never run
        }
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
        boolean condition = getCondition();
        if (condition) {
          // Some code that should never run
        } else {
          // Another code that should never run
        }
      }
    }
  }

  public void callOneWayBad() {
    oneWayOk();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
    } else {
      // Another code that should never run
    }
  }

  public void callAnotherWayBad() {
    anotherWayOk();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
    } else {
      // Another code that should never run
    }
  }

  private void callOneWayOk() {
    oneWayOk();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
    } else {
      // Another code that should never run
    }
  }

  private void callAnotherWayOk() {
    anotherWayOk();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
    } else {
      // Another code that should never run
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}