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

            // Introduced unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
              // This loop is unreachable because getCondition() always returns false
            }
          }
        });
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}