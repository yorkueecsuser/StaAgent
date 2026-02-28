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
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  public void transactBad() throws RemoteException {
    doTransactOk();
  }

  public void alsoBad() throws RemoteException {
    transactBad();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable if statement");
    }
  }

  private void chainOK() throws RemoteException {
    alsoBad();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Yet another unreachable if statement");
    }
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("Unreachable if statement in oneWayOk");
        }
      }
    }
  }

  private void anotherWayOk() {
    synchronized (lockB) {
      synchronized (lockA) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("Unreachable if statement in anotherWayOk");
        }
      }
    }
  }

  public void callOneWayBad() {
    oneWayOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in callOneWayBad");
    }
  }

  public void callAnotherWayBad() {
    anotherWayOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in callAnotherWayBad");
    }
  }

  private void callOneWayOk() {
    oneWayOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in callOneWayOk");
    }
  }

  private void callAnotherWayOk() {
    anotherWayOk();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in callAnotherWayOk");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}