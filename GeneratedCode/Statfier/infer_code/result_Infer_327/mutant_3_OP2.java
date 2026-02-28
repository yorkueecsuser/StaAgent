import android.os.Binder;
import android.os.RemoteException;
import java.util.concurrent.Executor;

class DirectStarvation {
  static Binder binder;

  // executors are injected and annotated as to what thread they schedule to
  @ForUiThread private final Executor mUiThreadExecutor = null;
  @ForNonUiThread private final Executor mNonUiThreadExecutor = null;

  // call which should not happen on UI thread
  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  // starvation via scheduling a transaction on UI thread
  public void postBlockingCallToUIThreadBad() {
    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
            // Mutated code: duplicating the assignment statement (though there are no direct assignments here, duplicating the runnable execution logic)
            mUiThreadExecutor.execute(
                new Runnable() {
                  @Override
                  public void run() {
                    doTransact();
                  }
                });
          }
        });
  }

  public void postBlockingCallToNonUIThreadOk() {
    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
            // Mutated code: duplicating the assignment statement (though there are no direct assignments here, duplicating the runnable execution logic)
            mNonUiThreadExecutor.execute(
                new Runnable() {
                  @Override
                  public void run() {
                    doTransact();
                  }
                });
          }
        });
  }
}