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
            switch (condition? 0 : 1) {
              case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case");
                break;
              case 1:
                // This case is always executed
                System.out.println("This is the reachable case");
                break;
            }
          }

          private boolean getCondition() {
            return false;
          }
        });
  }
}