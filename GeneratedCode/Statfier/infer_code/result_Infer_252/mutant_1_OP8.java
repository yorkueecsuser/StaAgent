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

  // Mutated code starts here
  private Executor getBackgroundExecutorMutant() {
    return Executors.getBackgroundExecutor();
  }

  private Executor indirectlyGetBackgroundExecutorMutant() {
    return getBackgroundExecutorMutant();
  }

  private Executor getForegroundExecutorMutant() {
    return Executors.getForegroundExecutor();
  }

  private Executor indirectlyGetForegroundExecutorMutant() {
    return getForegroundExecutorMutant();
  }

  // executors are all on background threads, no report
  public void postBlockingCallToForegroundExecutorOkMutant() {
    indirectlyGetForegroundExecutorMutant()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
              }
            });
  }

  // no report here
  public void postBlockingCallToBackgroundExecutorOkMutant() {
    indirectlyGetBackgroundExecutorMutant()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
              }
            });
  }

  private Executor getAnnotatedBackgroundExecutorMutant() {
    return mNonUiThreadExecutor;
  }

  private Executor indirectlyGetAnnotatedBackgroundExecutorMutant() {
    return getAnnotatedBackgroundExecutorMutant();
  }

  private Executor getAnnotatedForegroundExecutorMutant() {
    return mUiThreadExecutor;
  }

  private Executor indirectlyGetAnnotatedForegroundExecutorMutant() {
    return getAnnotatedForegroundExecutorMutant();
  }

  // starvation via scheduling a transaction on UI thread
  public void postBlockingCallToAnnnotatedUIThreadBadMutant() {
    indirectlyGetAnnotatedForegroundExecutorMutant()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
              }
            });
  }

  // no report here
  public void postBlockingCallToAnnotatedNonUIThreadOkMutant() {
    indirectlyGetAnnotatedBackgroundExecutorMutant()
       .execute(
            new Runnable() {
              @Override
              public void run() {
                doTransact();
              }
            });
  }

  Runnable getBadRunnableMutant() {
    return new Runnable() {
      @Override
      public void run() {
        doTransact();
      }
    };
  }

  public void postRunnableIndirectlyToUIThreadBadMutant() {
    mUiThreadExecutor.execute(getBadRunnableMutant());
  }

  Runnable runnableFieldMutant =
      new Runnable() {
        @Override
        public void run() {
          doTransact();
        }
      };

  public void postRunnableFieldToUIThreadBadMutant() {
    mUiThreadExecutor.execute(runnableFieldMutant);
  }
}