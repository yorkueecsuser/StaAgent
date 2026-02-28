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
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This case is unreachable because condition is never false
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
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This case is unreachable because condition is never false
        break;
    }
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
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This case is unreachable because condition is never false
        break;
    }
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
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This case is unreachable because condition is never false
        break;
    }
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
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This case is unreachable because condition is never false
        break;
    }
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
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This case is unreachable because condition is never false
        break;
    }
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
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This case is unreachable because condition is never false
        break;
    }
  }

  private boolean getCondition() {
    return true; // This ensures the switch condition is always true
  }
}