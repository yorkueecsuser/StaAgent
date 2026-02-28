import android.os.Binder;
import android.os.RemoteException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ModeledExecutors {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable
        break;
      case false:
        // This case is unreachable
        System.out.println("Unreachable switch case");
        break;
    }
  }

  public void postBlockingCallToForegroundExecutorOk() {
    Executors.getForegroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
              }
            });
  }

  public void postBlockingCallToBackgroundExecutorOk() {
    Executors.getBackgroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
              }
            });
  }

  // starvation via posting a transaction on UI thread
  public void staticPostBlockingCallToUIThreadBad() {
    Executors.postOnUiThread(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        });
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable
        break;
      case false:
        // This case is unreachable
        System.out.println("Unreachable switch case");
        break;
    }
  }

  // starvation via running a transaction on UI thread
  public void staticRunBlockingCallToUIThreadBad() {
    Executors.runOnUiThread(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        });
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable
        break;
      case false:
        // This case is unreachable
        System.out.println("Unreachable switch case");
        break;
    }
  }

  // starvation via running a delayed transaction on UI thread
  public void staticPostDelayedBlockingCallToUIThreadBad() {
    Executors.postOnUiThreadDelayed(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        },
        1000L);
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable
        break;
      case false:
        // This case is unreachable
        System.out.println("Unreachable switch case");
        break;
    }
  }

  public void scheduleGuaranteedDelayedBlockingCallToNonUIThreadOk() {
    Executors.scheduleGuaranteedDelayed(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        },
        1000L,
        1000L);
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable
        break;
      case false:
        // This case is unreachable
        System.out.println("Unreachable switch case");
        break;
    }
  }

  Object monitorA, monitorB;

  public void scheduleGuaranteedDelayedDeadlockBad() {
    Executors.scheduleGuaranteedDelayed(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorA) {
              synchronized (monitorB) {
              }
            }
          }
        },
        1000L,
        1000L);

    Executors.runOnUiThread(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorB) {
              synchronized (monitorA) {
              }
            }
          }
        });
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable
        break;
      case false:
        // This case is unreachable
        System.out.println("Unreachable switch case");
        break;
    }
  }

  @ForUiThread private final Executor mUiThreadExecutor = null;

  public void submitBlockingCallToUIThreadBad() {
    ExecutorService uiExecutor = (ExecutorService) mUiThreadExecutor;

    uiExecutor.submit(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        });
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable
        break;
      case false:
        // This case is unreachable
        System.out.println("Unreachable switch case");
        break;
    }
  }

  public void scheduleBlockingCallToUIThreadBad() {
    ScheduledExecutorService uiExecutor = (ScheduledExecutorService) mUiThreadExecutor;

    uiExecutor.schedule(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        },
        1000L,
        TimeUnit.SECONDS);
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable
        break;
      case false:
        // This case is unreachable
        System.out.println("Unreachable switch case");
        break;
    }
  }

  public void submitBadCallableToUIThreadBad() {
    ExecutorService uiExecutor = (ExecutorService) mUiThreadExecutor;

    uiExecutor.submit(
        new Callable<Object>() {
          @Override
          public Object call() {
            doTransact();
            return null;
          }
        });
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable
        break;
      case false:
        // This case is unreachable
        System.out.println("Unreachable switch case");
        break;
    }
  }

  public void postToUIThreadBad() {
    Executors.postToUiThread(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        });
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable
        break;
      case false:
        // This case is unreachable
        System.out.println("Unreachable switch case");
        break;
    }
  }

  private boolean getCondition() {
    return true; // Always returns true to make the false case unreachable
  }
}