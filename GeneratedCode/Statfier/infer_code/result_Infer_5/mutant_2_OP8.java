import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.UiThread;

class SkipAnalysis {
  Binder b;
  Binder c; // Mutated variable

  void doTransact() throws RemoteException {
    b.transact(0, null, null, 0);
  }

  void doTransactMutant() throws RemoteException { // Mutated method
    c.transact(0, null, null, 0); // Using mutated variable
  }

  @UiThread
  void callTransact() throws RemoteException {
    doTransact();
  }

  @UiThread
  void callTransactMutant() throws RemoteException { // Mutated method
    doTransactMutant(); // Calling mutated method
  }
}