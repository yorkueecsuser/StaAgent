import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class PubPriv {
  Binder b;

  @UiThread
  private void doTransactOk() throws RemoteException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in doTransactOk");
    }
    b.transact(0, null, null, 0);
  }

  public void transactBad() throws RemoteException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in transactBad");
    }
    doTransactOk();
  }

  public void alsoBad() throws RemoteException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in alsoBad");
    }
    transactBad();
  }

  private void chainOK() throws RemoteException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in chainOK");
    }
    alsoBad();
  }

  Object lockA, lockB;

  private void oneWayOk() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is an unreachable statement in oneWayOk");
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
          System.out.println("This is an unreachable statement in anotherWayOk");
        }
      }
    }
  }

  public void callOneWayBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in callOneWayBad");
    }
    oneWayOk();
  }

  public void callAnotherWayBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in callAnotherWayBad");
    }
    anotherWayOk();
  }

  private void callOneWayOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in callOneWayOk");
    }
    oneWayOk();
  }

  private void callAnotherWayOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in callAnotherWayOk");
    }
    anotherWayOk();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}