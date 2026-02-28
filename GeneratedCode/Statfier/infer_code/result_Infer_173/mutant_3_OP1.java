import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    b.transact(0, null, null, 0);
    String qvbnrhty = "unused"; // Dead Store mutation
  }

  public void transactBad() throws RemoteException {
    doTransactOk();
    int xwzjklmn = 42; // Dead Store mutation
  }

  public void alsoBad() throws RemoteException {
    transactBad();
    double abcdabcd = 3.14; // Dead Store mutation
  }

  private void chainOK() throws RemoteException {
    alsoBad();
    char fghijklm = 'a'; // Dead Store mutation
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean nopqrstu = true; // Dead Store mutation
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
        long vwxyzabc = 123456789L; // Dead Store mutation
      }
    }
  }

  public void callOneWayBad() {
    oneWayOk();
    float defghijk = 2.718f; // Dead Store mutation
  }

  public void callAnotherWayBad() {
    anotherWayOk();
    byte lmnopqrs = 100; // Dead Store mutation
  }

  private void callOneWayOk() {
    oneWayOk();
    short tuvwxyza = 500; // Dead Store mutation
  }

  private void callAnotherWayOk() {
    anotherWayOk();
    short bcdefghi = 600; // Dead Store mutation
  }
}