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
  }

  public void postToUIThreadBad() {
    Executors.postToUiThread(
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        });
  }

  // Mutated code
  static Binder b;

  private static void doTransactMutated() {
    try {
      b.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  public void postBlockingCallToForegroundExecutorOkMutated() {
    Executors.getForegroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransactMutated();
              }
            });
  }

  public void postBlockingCallToBackgroundExecutorOkMutated() {
    Executors.getBackgroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransactMutated();
              }
            });
  }

  // starvation via posting a transaction on UI thread
  public void staticPostBlockingCallToUIThreadBadMutated() {
    Executors.postOnUiThread(
        new Runnable() {
          @Override
          public void run() {
            doTransactMutated();
          }
        });
  }

  // starvation via running a transaction on UI thread
  public void staticRunBlockingCallToUIThreadBadMutated() {
    Executors.runOnUiThread(
        new Runnable() {
          @Override
          public void run() {
            doTransactMutated();
          }
        });
  }

  // starvation via running a delayed transaction on UI thread
  public void staticPostDelayedBlockingCallToUIThreadBadMutated() {
    Executors.postOnUiThreadDelayed(
        new Runnable() {
          @Override
          public void run() {
            doTransactMutated();
          }
        },
        1000L);
  }

  public void scheduleGuaranteedDelayedBlockingCallToNonUIThreadOkMutated() {
    Executors.scheduleGuaranteedDelayed(
        new Runnable() {
          @Override
          public void run() {
            doTransactMutated();
          }
        },
        1000L,
        1000L);
  }

  Object ma, mb;

  public void scheduleGuaranteedDelayedDeadlockBadMutated() {
    Executors.scheduleGuaranteedDelayed(
        new Runnable() {
          @Override
          public void run() {
            synchronized (ma) {
              synchronized (mb) {
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
            synchronized (mb) {
              synchronized (ma) {
              }
            }
          }
        });
  }

  @ForUiThread private final Executor me = null;

  public void submitBlockingCallToUIThreadBadMutated() {
    ExecutorService ue = (ExecutorService) me;

    ue.submit(
        new Runnable() {
          @Override
          public void run() {
            doTransactMutated();
          }
        });
  }

  public void scheduleBlockingCallToUIThreadBadMutated() {
    ScheduledExecutorService ue = (ScheduledExecutorService) me;

    ue.schedule(
        new Runnable() {
          @Override
          public void run() {
            doTransactMutated();
          }
        },
        1000L,
        TimeUnit.SECONDS);
  }

  public void submitBadCallableToUIThreadBadMutated() {
    ExecutorService ue = (ExecutorService) me;

    ue.submit(
        new Callable<Object>() {
          @Override
          public Object call() {
            doTransactMutated();
            return null;
          }
        });
  }

  public void postToUIThreadBadMutated() {
    Executors.postToUiThread(
        new Runnable() {
          @Override
          public void run() {
            doTransactMutated();
          }
        });
  }
}