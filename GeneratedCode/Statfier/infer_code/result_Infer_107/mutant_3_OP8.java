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
  static Binder a;

  private static void b() {
    try {
      a.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  @ForUiThread static Executor c = null;

  static Executor d;
  static Executor e;
  static Handler f;
  static Runnable g;
  static Runnable h;

  static {
    d = c;
    e = Executors.getBackgroundExecutor();
    f = new Handler(Looper.getMainLooper());
    g =
        new Runnable() {
          @Override
          public void run() {
            b();
          }
        };

    h =
        new Runnable() {
          @Override
          public void run() {}
        };
  }

  public void i() {
    d.execute(g);
  }

  public void j() {
    d.execute(h);
  }

  public void k() {
    e.execute(g);
  }

  public void l() {
    f.post(g);
  }
}