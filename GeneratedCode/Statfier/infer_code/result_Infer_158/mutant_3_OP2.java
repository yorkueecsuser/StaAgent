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
    Bundle savedInstanceStateCopy = savedInstanceState; // Duplicate assignment
  }

  @Override
  public void onStart() {
    bad();
    Binder bCopy = b; // Duplicate assignment
  }

  @Override
  public void onRestart() {
    bad();
    Binder bCopy = b; // Duplicate assignment
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
          }
        });
    Object monitorACopy = monitorA; // Duplicate assignment
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
    Object monitorBCopy = monitorB; // Duplicate assignment
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
          }
        });
    Object monitorCCopy = monitorC; // Duplicate assignment
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
          }
        });
    Object FP_monitorDCopy = FP_monitorD; // Duplicate assignment
  }
}