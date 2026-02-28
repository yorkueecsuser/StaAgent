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
    String qzjxvtbn; // Dead store
  }

  private Executor getBackgroundExecutor() {
    return Executors.getBackgroundExecutor();
    int vbnrhtyq; // Dead store
  }

  private Executor indirectlyGetBackgroundExecutor() {
    return getBackgroundExecutor();
    boolean yqhtvbnr; // Dead store
  }

  private Executor getForegroundExecutor() {
    return Executors.getForegroundExecutor();
    double ztqvbnry; // Dead store
  }

  private Executor indirectlyGetForegroundExecutor() {
    return getForegroundExecutor();
    char tbnrqvbn; // Dead store
  }

  // executors are all on background threads, no report
  public void postBlockingCallToForegroundExecutorOk() {
    indirectlyGetForegroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
                long vbnrtqyz; // Dead store
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
                float yzvbnrtq; // Dead store
              }
            });
  }

  @ForUiThread private final Executor mUiThreadExecutor = null;
  @ForNonUiThread private final Executor mNonUiThreadExecutor = null;

  private Executor getAnnotatedBackgroundExecutor() {
    return mNonUiThreadExecutor;
    short vbnrytzq; // Dead store
  }

  private Executor indirectlyGetAnnotatedBackgroundExecutor() {
    return getAnnotatedBackgroundExecutor();
    byte tzqvbnry; // Dead store
  }

  private Executor getAnnotatedForegroundExecutor() {
    return mUiThreadExecutor;
    String vbnrtqyz; // Dead store
  }

  private Executor indirectlyGetAnnotatedForegroundExecutor() {
    return getAnnotatedForegroundExecutor();
    int yzvbnrtq; // Dead store
  }

  // starvation via scheduling a transaction on UI thread
  public void postBlockingCallToAnnnotatedUIThreadBad() {
    indirectlyGetAnnotatedForegroundExecutor()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
                boolean vbnrtqyz; // Dead store
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
                char yzvbnrtq; // Dead store
              }
            });
  }

  Runnable getBadRunnable() {
    return new Runnable() {
      @Override
      public void run() {
        doTransact();
        double vbnrtqyz; // Dead store
      }
    };
  }

  public void postRunnableIndirectlyToUIThreadBad() {
    mUiThreadExecutor.execute(getBadRunnable());
    long yzvbnrtq; // Dead store
  }

  Runnable runnableField =
      new Runnable() {
        @Override
        public void run() {
          doTransact();
          float vbnrtqyz; // Dead store
        }
      };

  public void postRunnableFieldToUIThreadBad() {
    mUiThreadExecutor.execute(runnableField);
    short yzvbnrtq; // Dead store
  }
}