import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class SkipAnalysis {
  Binder b;

  void doTransact() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    b.transact(0, null, null, 0);
  }

  @UiThread
  void callTransact() throws RemoteException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    doTransact();
  }

  private boolean getCondition() {
    return false;
  }
}