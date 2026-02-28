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
        // Mutation: Duplicate the assignment statement
        lockA = lockA;
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
        // Mutation: Duplicate the assignment statement
        lockB = lockB;
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
}