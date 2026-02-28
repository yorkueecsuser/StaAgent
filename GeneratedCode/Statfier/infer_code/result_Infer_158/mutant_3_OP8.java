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

  Object x; // Renamed from monitorA
  @ForNonUiThread private final Executor y = null; // Renamed from mNonUiThreadExecutor

  // method is a UI thread callback, and schedules a transaction in the background
  // but it synchronises on the lock protecting the transaction, thus stalling the main thread
  @Override
  public void onStop() {
    synchronized (x) {
    }

    y.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (x) {
              bad();
            }
          }
        });
  }

  Object z, w; // Renamed from monitorB and monitorC

  // method is a UI thread callback and deadlocks with work scheduled in
  // another callback (onPause) but which schedules work to a background thread
  @Override
  public void onDestroy() {
    synchronized (w) {
      synchronized (z) {
      }
    }
  }

  @Override
  public void onPause() {
    y.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (z) {
              synchronized (w) {
              }
            }
          }
        });
  }

  Object v, u; // Renamed from FP_monitorD and FP_monitorE

  // False positive: by the time the work is scheduled, no lock is held, so no deadlock
  // Locks are named FP_* so that the report is clearly an FP (we can't change the name of the
  // override).
  @Override
  public void onResume() {
    synchronized (v) {
      synchronized (u) {
      }
    }

    y.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (u) {
              synchronized (v) {
              }
            }
          }
        });
  }
}