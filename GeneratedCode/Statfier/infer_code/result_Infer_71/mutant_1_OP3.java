import android.os.Binder;
import android.os.RemoteException;
import java.util.concurrent.Executor;

class IndirectStarvation {
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

  Object monitorA;

  // starvation via locking on UI thread and doing a transaction under that lock
  // in a background thread
  public void postBlockingCallToBackgroundThreadAndLockBad() {
    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorA) {
              boolean condition = getCondition();
              if (condition) {
                // This is an unreachable if statement
                System.out.println("This will never be printed");
              }
            }
          }
        });

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorA) {
              doTransact();
            }
          }
        });
  }

  Object monitorB, monitorC;

  // no starvation, as lock on UI thread is not used for transaction on background thread
  public void postBlockingCallToBackgroundThreadAndUseOtherLockOk() {
    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorB) {
              boolean condition = getCondition();
              if (condition) {
                // This is an unreachable if statement
                System.out.println("This will never be printed either");
              }
            }
          }
        });

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorC) {
              doTransact();
            }
          }
        });
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}