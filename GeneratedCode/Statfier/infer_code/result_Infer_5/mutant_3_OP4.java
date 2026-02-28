import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class SkipAnalysis {
  Binder b;

  void doTransact() throws RemoteException {
    b.transact(0, null, null, 0);

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This block is reachable");
    } else {
      // This block is unreachable
      System.out.println("This block is unreachable");
    }
  }

  @UiThread
  void callTransact() throws RemoteException {
    doTransact();
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // Always returns true to make the else block unreachable
  }
}