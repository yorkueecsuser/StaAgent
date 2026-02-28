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
    // Dead Store Mutation
    String qzjxvbnr = "unused";
  }

  // overrides so no Bad suffixes

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    bad();
    // Dead Store Mutation
    int wertgfds = 42;
  }

  @Override
  public void onStart() {
    bad();
    // Dead Store Mutation
    boolean ytrhnjkl = false;
  }

  @Override
  public void onRestart() {
    bad();
    // Dead Store Mutation
    double asdfghjk = 3.14;
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
            // Dead Store Mutation
            char lmnbvcxz = 'a';
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
    // Dead Store Mutation
    float poiuytrew = 2.718f;
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
            // Dead Store Mutation
            long klmnopqr = 123456789L;
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
            // Dead Store Mutation
            short zxcvbnml = 123;
          }
        });
  }
}