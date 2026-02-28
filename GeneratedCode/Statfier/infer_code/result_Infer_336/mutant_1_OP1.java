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
      String jxqfvtzu; // Dead store mutation
    }
  }

  public void postBlockingCallToForegroundExecutorOk() {
    Executors.getForegroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
                int wvbnrhty; // Dead store mutation
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
                boolean klmnopqr; // Dead store mutation
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
            double rstuvwxy; // Dead store mutation
          }
        });
  }

  // starvation via running a transaction on UI thread
  public void staticRunBlockingCallToUIThreadBad() {
    Executors.runOnUiThread(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
            char zabcdefgh; // Dead store mutation
          }
        });
  }

  // starvation via running a delayed transaction on UI thread
  public void staticPostDelayedBlockingCallToUIThreadBad() {
    Executors.postOnUiThreadDelayed(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
            float ijklmnop; // Dead store mutation
          }
        },
        1000L);
  }

  public void scheduleGuaranteedDelayedBlockingCallToNonUIThreadOk() {
    Executors.scheduleGuaranteedDelayed(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
            long qrstuvwx; // Dead store mutation
          }
        },
        1000L,
        1000L);
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
            short yzabcdef; // Dead store mutation
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
            byte ghijklmn; // Dead store mutation
          }
        });
  }

  @ForUiThread private final Executor mUiThreadExecutor = null;

  public void submitBlockingCallToUIThreadBad() {
    ExecutorService uiExecutor = (ExecutorService) mUiThreadExecutor;

    uiExecutor.submit(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
            int opqrstuv; // Dead store mutation
          }
        });
  }

  public void scheduleBlockingCallToUIThreadBad() {
    ScheduledExecutorService uiExecutor = (ScheduledExecutorService) mUiThreadExecutor;

    uiExecutor.schedule(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
            long vwxyzabc; // Dead store mutation
          }
        },
        1000L,
        TimeUnit.SECONDS);
  }

  public void submitBadCallableToUIThreadBad() {
    ExecutorService uiExecutor = (ExecutorService) mUiThreadExecutor;

    uiExecutor.submit(
        new Callable<Object>() {
          @Override
          public Object call() {
            doTransact();
            double defghijk; // Dead store mutation
            return null;
          }
        });
  }

  public void postToUIThreadBad() {
    Executors.postToUiThread(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
            char lmnopqrs; // Dead store mutation
          }
        });
  }
}