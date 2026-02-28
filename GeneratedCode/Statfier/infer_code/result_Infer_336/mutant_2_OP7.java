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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}