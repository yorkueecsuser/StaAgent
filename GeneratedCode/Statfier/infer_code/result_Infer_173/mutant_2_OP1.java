import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    b.transact(0, null, null, 0);
    String ykfqjvbn = "unused"; // Dead Store mutation
  }

  public void transactBad() throws RemoteException {
    doTransactOk();
    int xwvutrqp = 42; // Dead Store mutation
  }

  public void alsoBad() throws RemoteException {
    transactBad();
    boolean lmponmlk = true; // Dead Store mutation
  }

  private void chainOK() throws RemoteException {
    alsoBad();
    char zxcvbnmz = 'a'; // Dead Store mutation
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
        double asdfghjk = 3.14; // Dead Store mutation
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
        float qwertyui = 2.71f; // Dead Store mutation
      }
    }
  }

  public void callOneWayBad() {
    oneWayOk();
    long poiuytrewq = 123456789L; // Dead Store mutation
  }

  public void callAnotherWayBad() {
    anotherWayOk();
    short hgfdsazxcv = 1234; // Dead Store mutation
  }

  private void callOneWayOk() {
    oneWayOk();
    byte mnbvcxzasd = 127; // Dead Store mutation
  }

  private void callAnotherWayOk() {
    anotherWayOk();
    float lkjhgfdsa = 1.618f; // Dead Store mutation
  }
}