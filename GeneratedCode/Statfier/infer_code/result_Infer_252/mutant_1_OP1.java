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
    String qvbnrhty; // Dead store
  }

  private Executor getBackgroundExecutor() {
    return Executors.getBackgroundExecutor();
    int xwvfrtgb; // Dead store
  }

  private Executor indirectlyGetBackgroundExecutor() {
    return getBackgroundExecutor();
    boolean jkldfgha; // Dead store
  }

  private Executor getForegroundExecutor() {
    return Executors.getForegroundExecutor();
    double wertuyio; // Dead store
  }

  private Executor indirectlyGetForegroundExecutor() {
    return getForegroundExecutor();
    char asdfghjk; // Dead store
  }

  // executors are all on background threads, no report
  public void postBlockingCallToForegroundExecutorOk() {
    indirectlyGetForegroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
                long poiuytrew; // Dead store
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
                float lkjhgfdsa; // Dead store
              }
            });
  }

  @ForUiThread private final Executor mUiThreadExecutor = null;
  @ForNonUiThread private final Executor mNonUiThreadExecutor = null;

  private Executor getAnnotatedBackgroundExecutor() {
    return mNonUiThreadExecutor;
    short zxcvbnm; // Dead store
  }

  private Executor indirectlyGetAnnotatedBackgroundExecutor() {
    return getAnnotatedBackgroundExecutor();
    byte cvbnmkj; // Dead store
  }

  private Executor getAnnotatedForegroundExecutor() {
    return mUiThreadExecutor;
    String qwertyui; // Dead store
  }

  private Executor indirectlyGetAnnotatedForegroundExecutor() {
    return getAnnotatedForegroundExecutor();
    int yuiopasd; // Dead store
  }

  // starvation via scheduling a transaction on UI thread
  public void postBlockingCallToAnnnotatedUIThreadBad() {
    indirectlyGetAnnotatedForegroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
                boolean fghjklpoi; // Dead store
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
                double asdfghjkl; // Dead store
              }
            });
  }

  Runnable getBadRunnable() {
    return new Runnable() {
      @Override
      public void run() {
        doTransact();
        char mnbvcxz; // Dead store
      }
    };
  }

  public void postRunnableIndirectlyToUIThreadBad() {
    mUiThreadExecutor.execute(getBadRunnable());
    float poiuytrewq; // Dead store
  }

  Runnable runnableField =
      new Runnable() {
        @Override
        public void run() {
          doTransact();
          long lkjhgfdsa; // Dead store
        }
      };

  public void postRunnableFieldToUIThreadBad() {
    mUiThreadExecutor.execute(runnableField);
    double zxcvbnml; // Dead store
  }
}