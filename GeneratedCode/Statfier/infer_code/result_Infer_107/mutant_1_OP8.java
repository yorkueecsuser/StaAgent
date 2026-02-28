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
  static Executor x;
  static Executor y;
  static Handler z;
  static Runnable a;
  static Runnable b;

  static {
    x = mUiThreadExecutor;
    y = Executors.getBackgroundExecutor();
    z = new Handler(Looper.getMainLooper());
    a =
        new Runnable() {
          @Override
          public void run() {
            doTransact();
          }
        };

    b =
        new Runnable() {
          @Override
          public void run() {}
        };
  }

  public void c() {
    x.execute(a);
  }

  public void d() {
    x.execute(b);
  }

  public void e() {
    y.execute(a);
  }

  public void f() {
    z.post(a);
  }
}