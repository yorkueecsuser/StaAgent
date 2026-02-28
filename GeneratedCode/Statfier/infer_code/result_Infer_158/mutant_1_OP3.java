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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    bad();
  }

  @Override
  public void onStart() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    bad();
  }

  @Override
  public void onRestart() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    bad();
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
            boolean condition = getCondition();
            if (condition) {
              // Unreachable code
              System.out.println("This is unreachable code");
            }
            synchronized (monitorA) {
              bad();
            }
          }
        });
  }

  Object monitorB, monitorC;

  // method is a UI thread callback and deadlocks with work scheduled in
  // another callback (onPause) but which schedules work to a background thread
  @Override
  public void onDestroy() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    synchronized (monitorC) {
      synchronized (monitorB) {
      }
    }
  }

  @Override
  public void onPause() {
    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            boolean condition = getCondition();
            if (condition) {
              // Unreachable code
              System.out.println("This is unreachable code");
            }
            synchronized (monitorB) {
              synchronized (monitorC) {
              }
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
            boolean condition = getCondition();
            if (condition) {
              // Unreachable code
              System.out.println("This is unreachable code");
            }
            synchronized (FP_monitorE) {
              synchronized (FP_monitorD) {
              }
            }
          }
        });
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}