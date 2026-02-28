import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import java.util.concurrent.Executor;

class StaticInitAttributes {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  @ForUiThread static Executor mUiThreadExecutor = null;

  static Executor mUiExecutor;
  static Executor mNonUiExecutor;
  static Handler mUiHandler;
  static Runnable mBadRunnable;
  static Runnable mOkRunnable;

  static {
    mUiExecutor = mUiThreadExecutor;
    mNonUiExecutor = Executors.getBackgroundExecutor();
    mUiHandler = new Handler(Looper.getMainLooper());
    mBadRunnable =
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        };

    mOkRunnable =
        new Runnable() {
          @Override
          public void run() {}
        };
  }

  public void postBlockingCallToUIExecutorBad() {
    mUiExecutor.execute(mBadRunnable);
  }

  public void postNoopCallToUIExecutorOk() {
    mUiExecutor.execute(mOkRunnable);
  }

  public void postBlockingCallToNonUIExecutorOk() {
    mNonUiExecutor.execute(mBadRunnable);
  }

  public void postBlockingCallToUIHandlerBad() {
    mUiHandler.post(mBadRunnable);
  }

  // Mutated code
  static Binder x;
  static Executor y;
  static Executor z;
  static Handler w;
  static Runnable v;
  static Runnable u;

  static {
    y = mUiThreadExecutor;
    z = Executors.getBackgroundExecutor();
    w = new Handler(Looper.getMainLooper());
    v =
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        };

    u =
        new Runnable() {
          @Override
          public void run() {}
        };
  }

  public void postBlockingCallToUIExecutorBadMutant() {
    y.execute(v);
  }

  public void postNoopCallToUIExecutorOkMutant() {
    y.execute(u);
  }

  public void postBlockingCallToNonUIExecutorOkMutant() {
    z.execute(v);
  }

  public void postBlockingCallToUIHandlerBadMutant() {
    w.post(v);
  }
}