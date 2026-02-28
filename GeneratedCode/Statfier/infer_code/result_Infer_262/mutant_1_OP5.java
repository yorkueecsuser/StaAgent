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
            // Unreachable switch statement
            boolean condition = getCondition();
            switch(condition) {
              case true:
                System.out.println("This is unreachable");
                break;
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
                // Unreachable switch statement
                boolean condition = getCondition();
                switch(condition) {
                  case true:
                    System.out.println("This is unreachable");
                    break;
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
            // Unreachable switch statement
            boolean condition = getCondition();
            switch(condition) {
              case true:
                System.out.println("This is unreachable");
                break;
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
            // Unreachable switch statement
            boolean condition = getCondition();
            switch(condition) {
              case true:
                System.out.println("This is unreachable");
                break;
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
            // Unreachable switch statement
            boolean condition = getCondition();
            switch(condition) {
              case true:
                System.out.println("This is unreachable");
                break;
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
            // Unreachable switch statement
            boolean condition = getCondition();
            switch(condition) {
              case true:
                System.out.println("This is unreachable");
                break;
            }
          }
        });
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}