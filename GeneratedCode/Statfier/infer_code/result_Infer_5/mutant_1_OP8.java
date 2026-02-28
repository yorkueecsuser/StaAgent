import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class SkipAnalysis {
  Binder b;
  Binder c; // Mutant variable

  void doTransact() throws RemoteException {
    b.transact(0, null, null, 0);
    c.transact(0, null, null, 0); // Mutant code
  }

  @UiThread
  void callTransact() throws RemoteException {
    doTransact();
  }
}