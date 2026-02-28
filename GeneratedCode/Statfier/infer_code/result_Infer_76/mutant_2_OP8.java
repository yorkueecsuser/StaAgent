import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;

class ModeledHandler {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  // starvation via scheduling a transaction on UI thread
  public void postBlockingCallToUIThreadBad() {
    Handler handler = new Handler(Looper.getMainLooper());

    handler.post(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        });
  }

  // Mutated code with renaming mutation operator
  public void postBlockingCallToUIThreadBadMutant() {
    Handler z = new Handler(Looper.getMainLooper());

    z.post(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        });
  }
}