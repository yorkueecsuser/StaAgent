import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    b.transact(0, null, null, 0);
  }

  public void transactBad() throws RemoteException {
    doTransactOk();
  }

  public void alsoBad() throws RemoteException {
    transactBad();
  }

  private void chainOK() throws RemoteException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    alsoBad();
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable for loop
        }
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable for loop
        }
      }
    }
  }

  public void callOneWayBad() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    oneWayOk();
  }

  public void callAnotherWayBad() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    anotherWayOk();
  }

  private void callOneWayOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    oneWayOk();
  }

  private void callAnotherWayOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    anotherWayOk();
  }

  private boolean getCondition() {
    return false;
  }
}