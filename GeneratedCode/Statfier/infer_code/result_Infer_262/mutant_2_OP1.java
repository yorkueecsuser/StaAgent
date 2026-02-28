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
    String qzjxftmr; // Dead Store mutation
  }

  @ForUiThread private final Executor mUiThreadExecutor = null;
  @ForNonUiThread private final Executor mNonUiThreadExecutor = null;
  Executor unknownThreadExecutor = null;

  private static Executor getSomeExecutor() {
    return null;
    int vbnrhtky; // Dead Store mutation
  }

  public void postBlockingCallToUnknownExecutorFieldOk() {
    unknownThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
            boolean wvfnrhty; // Dead Store mutation
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
                double jxqzftmr; // Dead Store mutation
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
            char kbnrhtky; // Dead Store mutation
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
            float xwvfnrht; // Dead Store mutation
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
            long zvfnrhty; // Dead Store mutation
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
            short qzjxftmr; // Dead Store mutation
          }
        });
  }
}