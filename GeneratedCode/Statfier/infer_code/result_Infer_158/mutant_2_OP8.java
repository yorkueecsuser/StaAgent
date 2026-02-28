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
  }

  @Override
  public void onStart() {
    bad();
  }

  @Override
  public void onRestart() {
    bad();
  }

  Object x; // Renamed from monitorA to x
  @ForNonUiThread private final Executor mNonUiThreadExecutor = null;

  // method is a UI thread callback, and schedules a transaction in the background
  // but it synchronises on the lock protecting the transaction, thus stalling the main thread
  @Override
  public void onStop() {
    synchronized (x) {
    }

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (x) {
              bad();
            }
          }
        });
  }

  Object y, z; // Renamed from monitorC and monitorB to y and z respectively

  // method is a UI thread callback and deadlocks with work scheduled in
  // another callback (onPause) but which schedules work to a background thread
  @Override
  public void onDestroy() {
    synchronized (y) {
      synchronized (z) {
      }
    }
  }

  @Override
  public void onPause() {
    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (z) {
              synchronized (y) {
              }
            }
          }
        });
  }

  Object a, b1; // Renamed from FP_monitorD and FP_monitorE to a and b1 respectively

  // False positive: by the time the work is scheduled, no lock is held, so no deadlock
  // Locks are named FP_* so that the report is clearly an FP (we can't change the name of the
  // override).
  @Override
  public void onResume() {
    synchronized (a) {
      synchronized (b1) {
      }
    }

    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (b1) {
              synchronized (a) {
              }
            }
          }
        });
  }
}