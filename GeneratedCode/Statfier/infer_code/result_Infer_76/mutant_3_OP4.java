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
            // Introduced unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // This block is intended to be unreachable
              System.out.println("This is an unreachable block");
            } else {
              // Alternative unreachable block
              System.out.println("This is another unreachable block");
            }
          }
        });
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}