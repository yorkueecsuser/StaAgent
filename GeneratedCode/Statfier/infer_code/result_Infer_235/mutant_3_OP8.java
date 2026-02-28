import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import java.util.concurrent.Executor;

class ImplicitConstructor {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  @ForUiThread private final Executor mUiThreadExecutor = null;

  Executor mUiExecutor = mUiThreadExecutor;
  Executor mNonUiExecutor = Executors.getBackgroundExecutor();
  Handler mUiHandler = new Handler(Looper.getMainLooper());
  Runnable mBadRunnable =
      new Runnable() {
        @Override
        public void run() {
          doTransact();
        }
      };

  Runnable mOkRunnable =
      new Runnable() {
        @Override
        public void run() {}
      };

  Runnable mAmbiguous;

  ImplicitConstructor() {
    mAmbiguous = mBadRunnable;
  }

  ImplicitConstructor(int data) {
    mAmbiguous = mOkRunnable;
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

  public void postAmbiguousRunnableToUIExecutorOk() {
    mUiExecutor.execute(mAmbiguous);
  }

  // Mutated code
  Executor a = mUiThreadExecutor;
  Executor b = mNonUiExecutor;
  Handler c = mUiHandler;
  Runnable d = mBadRunnable;
  Runnable e = mOkRunnable;
  Runnable f = mAmbiguous;

  ImplicitConstructor g() {
    f = d;
    return this;
  }

  ImplicitConstructor h(int i) {
    f = e;
    return this;
  }

  public void i() {
    a.execute(d);
  }

  public void j() {
    a.execute(e);
  }

  public void k() {
    b.execute(d);
  }

  public void l() {
    c.post(d);
  }

  public void m() {
    a.execute(f);
  }
}