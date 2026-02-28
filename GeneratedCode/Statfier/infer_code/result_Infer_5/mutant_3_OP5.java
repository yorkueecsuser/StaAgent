import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class SkipAnalysis {
  Binder b;

  void doTransact() throws RemoteException {
    b.transact(0, null, null, 0);

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("This is also unreachable code");
        break;
    }
  }

  @UiThread
  void callTransact() throws RemoteException {
    doTransact();
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}