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
            // Inserting unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
              // This loop is unreachable because getCondition() will always return false
            }
          }
        });
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}