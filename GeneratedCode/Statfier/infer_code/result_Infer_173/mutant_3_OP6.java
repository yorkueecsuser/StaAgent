import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    b.transact(0, null, null, 0);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
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
    oneWayOk();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  public void callAnotherWayBad() {
    anotherWayOk();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private void callOneWayOk() {
    oneWayOk();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private void callAnotherWayOk() {
    anotherWayOk();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}