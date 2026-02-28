import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class SkipAnalysis {
  Binder b;

  void doTransact() throws RemoteException {
    b.transact(0, null, null, 0);

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case will also never be executed due to the same reason
        System.out.println("This is also an unreachable case");
        break;
    }
  }

  @UiThread
  void callTransact() throws RemoteException {
    doTransact();
  }

  // Method to provide a dynamic condition that always evaluates to false
  private boolean getCondition() {
    return false;
  }
}