import android.os.Binder;
import android.os.RemoteException;
import java.util.concurrent.Executor;

class AttributeFlows {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private Executor getBackgroundExecutor() {
    return Executors.getBackgroundExecutor();
  }

  private Executor indirectlyGetBackgroundExecutor() {
    return getBackgroundExecutor();
  }

  private Executor getForegroundExecutor() {
    return Executors.getForegroundExecutor();
  }

  private Executor indirectlyGetForegroundExecutor() {
    return getForegroundExecutor();
  }

  // executors are all on background threads, no report
  public void postBlockingCallToForegroundExecutorOk() {
    indirectlyGetForegroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
              }
            });
  }

  // no report here
  public void postBlockingCallToBackgroundExecutorOk() {
    indirectlyGetBackgroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
              }
            });
  }

  @ForUiThread private final Executor mUiThreadExecutor = null;
  @ForNonUiThread private final Executor mNonUiThreadExecutor = null;

  private Executor getAnnotatedBackgroundExecutor() {
    return mNonUiThreadExecutor;
  }

  private Executor indirectlyGetAnnotatedBackgroundExecutor() {
    return getAnnotatedBackgroundExecutor();
  }

  private Executor getAnnotatedForegroundExecutor() {
    return mUiThreadExecutor;
  }

  private Executor indirectlyGetAnnotatedForegroundExecutor() {
    return getAnnotatedForegroundExecutor();
  }

  // starvation via scheduling a transaction on UI thread
  public void postBlockingCallToAnnnotatedUIThreadBad() {
    indirectlyGetAnnotatedForegroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
              }
            });
  }

  // no report here
  public void postBlockingCallToAnnotatedNonUIThreadOk() {
    indirectlyGetAnnotatedBackgroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
              }
            });
  }

  Runnable getBadRunnable() {
    return new Runnable() {
      @Override
      public void run() {
        doTransact();
      }
    };
  }

  public void postRunnableIndirectlyToUIThreadBad() {
    mUiThreadExecutor.execute(getBadRunnable());
  }

  Runnable runnableField =
      new Runnable() {
        @Override
        public void run() {
          doTransact();
        }
      };

  public void postRunnableFieldToUIThreadBad() {
    mUiThreadExecutor.execute(runnableField);
  }

  private boolean getCondition() {
    // This method ensures that the condition is never true
    return false;
  }
}