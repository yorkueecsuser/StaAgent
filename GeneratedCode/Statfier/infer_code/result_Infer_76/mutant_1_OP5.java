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

            // Introduced unreachable switch statement
            boolean condition = getCondition();
            switch (condition) {
              case true:
                System.out.println("This is unreachable code");
                break;
              default:
                System.out.println("This is also unreachable code");
                break;
            }
          }
        });
  }

  // Method to provide a dynamic condition for the switch statement
  private boolean getCondition() {
    return false;
  }
}