import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class SkipAnalysis {
  Binder b;

  void doTransact() throws RemoteException {
    b.transact(0, null, null, 0);
    // Dead store mutation
    String qzjfnrht = "unusedVariable";
  }

  @UiThread
  void callTransact() throws RemoteException {
    doTransact();
    // Dead store mutation
    int xwvbnrht = 42;
  }
}