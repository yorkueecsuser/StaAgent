import android.os.Binder;
import android.os.RemoteException;
import java.util.concurrent.Executor;

// we treat executors of unknown thread as implicitly running in the background

class UnknownThread {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  @ForUiThread private final Executor mUiThreadExecutor = null;
  @ForNonUiThread private final Executor mNonUiThreadExecutor = null;
  Executor unknownThreadExecutor = null;

  private static Executor getSomeExecutor() {
    return null;
  }

  public void postBlockingCallToUnknownExecutorFieldOk() {
    unknownThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // This block is reachable if shouldRun is true
            } else {
              // This block is unreachable if shouldRun is false
            }
          }
        });
  }

  public void postBlockingCallToUnknownExecutorViaMethodOk() {
    getSomeExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
                boolean shouldRun = getCondition();
                if (shouldRun) {
                  // This block is reachable if shouldRun is true
                } else {
                  // This block is unreachable if shouldRun is false
                }
              }
            });
  }

  Object monitorA, monitorB;

  // text-book deadlock between unknown and background thread
  public void postDeadlockToUnknownAndBackgroundBad() {
    unknownThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorA) {
              synchronized (monitorB) {
              }
            }
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // This block is reachable if shouldRun is true
            } else {
              // This block is unreachable if shouldRun is false
            }
          }
        });

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorB) {
              synchronized (monitorA) {
              }
            }
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // This block is reachable if shouldRun is true
            } else {
              // This block is unreachable if shouldRun is false
            }
          }
        });
  }

  Object monitorC, monitorD;

  // text-book deadlock between unknown and background thread
  public void postDeadlockToUIAndBackgroundBad() {
    unknownThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorC) {
              synchronized (monitorD) {
              }
            }
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // This block is reachable if shouldRun is true
            } else {
              // This block is unreachable if shouldRun is false
            }
          }
        });

    mUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorD) {
              synchronized (monitorC) {
              }
            }
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // This block is reachable if shouldRun is true
            } else {
              // This block is unreachable if shouldRun is false
            }
          }
        });
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}