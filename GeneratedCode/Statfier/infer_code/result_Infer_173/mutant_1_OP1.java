import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    b.transact(0, null, null, 0);
    String xqjvbnrj = "deadstore"; // Dead Store mutation
  }

  public void transactBad() throws RemoteException {
    doTransactOk();
  }

  public void alsoBad() throws RemoteException {
    transactBad();
    int khtyfzxc = 42; // Dead Store mutation
  }

  private void chainOK() throws RemoteException {
    alsoBad();
    boolean mnbvcxzp = true; // Dead Store mutation
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
        double qwertyui = 3.14; // Dead Store mutation
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
        char asdfghjk = 'a'; // Dead Store mutation
      }
    }
  }

  public void callOneWayBad() {
    oneWayOk();
    long poiuytrew = 123456789L; // Dead Store mutation
  }

  public void callAnotherWayBad() {
    anotherWayOk();
    float lkjhgfdsa = 2.718f; // Dead Store mutation
  }

  private void callOneWayOk() {
    oneWayOk();
    short zxcvbnml = 123; // Dead Store mutation
  }

  private void callAnotherWayOk() {
    anotherWayOk();
    byte cvbnmlok = 10; // Dead Store mutation
  }
}