import android.app.Activity;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

class MyActivity extends Activity {
  Binder b;

  private void bad() {
    try {
      b.transact(0, null, null, 0);
    } catch (RemoteException r) {
    }
  }

  // overrides so no Bad suffixes

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    bad();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @Override
  public void onStart() {
    bad();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @Override
  public void onRestart() {
    bad();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  Object monitorA;
  @ForNonUiThread private final Executor mNonUiThreadExecutor = null;

  // method is a UI thread callback, and schedules a transaction in the background
  // but it synchronises on the lock protecting the transaction, thus stalling the main thread
  @Override
  public void onStop() {
    synchronized (monitorA) {
    }

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorA) {
              bad();
            }
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
              // Unreachable loop
            }
          }
        });
  }

  Object monitorB, monitorC;

  // method is a UI thread callback and deadlocks with work scheduled in
  // another callback (onPause) but which schedules work to a background thread
  @Override
  public void onDestroy() {
    synchronized (monitorC) {
      synchronized (monitorB) {
      }
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @Override
  public void onPause() {
    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorB) {
              synchronized (monitorC) {
              }
            }
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
              // Unreachable loop
            }
          }
        });
  }

  Object FP_monitorD, FP_monitorE;

  // False positive: by the time the work is scheduled, no lock is held, so no deadlock
  // Locks are named FP_* so that the report is clearly an FP (we can't change the name of the
  // override).
  @Override
  public void onResume() {
    synchronized (FP_monitorD) {
      synchronized (FP_monitorE) {
      }
    }

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (FP_monitorE) {
              synchronized (FP_monitorD) {
              }
            }
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
              // Unreachable loop
            }
          }
        });
  }

  private boolean getCondition() {
    return false;
  }
}