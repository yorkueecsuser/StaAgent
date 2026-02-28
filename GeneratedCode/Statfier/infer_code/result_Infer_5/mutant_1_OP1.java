import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class SkipAnalysis {
  Binder b;

  void doTransact() throws RemoteException {
    b.transact(0, null, null, 0);
    // Dead Store Mutation
    String jxqfvrht = "unusedVariable";
  }

  @UiThread
  void callTransact() throws RemoteException {
    doTransact();
  }
}