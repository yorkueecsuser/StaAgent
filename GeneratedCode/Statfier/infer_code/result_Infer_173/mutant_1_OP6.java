import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    b.transact(0, null, null, 0);
  }

  public void transactBad() throws RemoteException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    doTransactOk();
  }

  public void alsoBad() throws RemoteException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    transactBad();
  }

  private void chainOK() throws RemoteException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    alsoBad();
  }

  Object lockA, lockB;

  private void oneWayOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    synchronized (lockA) {
      synchronized (lockB) {
      }
    }
  }

  private void anotherWayOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    synchronized (lockB) {
      synchronized (lockA) {
      }
    }
  }

  public void callOneWayBad() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    oneWayOk();
  }

  public void callAnotherWayBad() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    anotherWayOk();
  }

  private void callOneWayOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    oneWayOk();
  }

  private void callAnotherWayOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    anotherWayOk();
  }

  private boolean getCondition() {
    return false;
  }
}