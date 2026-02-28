import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    b.transact(0, null, null, 0);
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
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
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

  // Mutated code starts here

  Binder c;

  @UiThread
  private void doTransactOkMutant() throws RemoteException {
    c.transact(0, null, null, 0);
  }

  public void transactBadMutant() throws RemoteException {
    doTransactOkMutant();
  }

  public void alsoBadMutant() throws RemoteException {
    transactBadMutant();
  }

  private void chainOKMutant() throws RemoteException {
    alsoBadMutant();
  }

  Object x, y;

  private void oneWayOkMutant() {
    synchronized (x) {
      synchronized (y) {
      }
    }
  }

  private void anotherWayOkMutant() {
    synchronized (y) {
      synchronized (x) {
      }
    }
  }

  public void callOneWayBadMutant() {
    oneWayOkMutant();
  }

  public void callAnotherWayBadMutant() {
    anotherWayOkMutant();
  }

  private void callOneWayOkMutant() {
    oneWayOkMutant();
  }

  private void callAnotherWayOkMutant() {
    anotherWayOkMutant();
  }
}