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
  Executor x = mUiThreadExecutor;
  Executor y = mNonUiExecutor;
  Handler z = new Handler(Looper.getMainLooper());
  Runnable a =
      new Runnable() {
        @Override
        public void run() {
          doTransact();
        }
      };

  Runnable b =
      new Runnable() {
        @Override
        public void run() {}
      };

  Runnable c;

  ImplicitConstructor(boolean flag) {
    c = a;
  }

  ImplicitConstructor(double value) {
    c = b;
  }

  public void methodWithNewNames() {
    x.execute(a);
    x.execute(b);
    y.execute(a);
    z.post(a);
    x.execute(c);
  }
}