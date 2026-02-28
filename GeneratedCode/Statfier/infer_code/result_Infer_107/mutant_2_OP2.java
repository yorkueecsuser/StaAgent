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
    mUiExecutor = mUiThreadExecutor; // Duplicate assignment
    mNonUiExecutor = Executors.getBackgroundExecutor();
    mNonUiExecutor = Executors.getBackgroundExecutor(); // Duplicate assignment
    mUiHandler = new Handler(Looper.getMainLooper());
    mUiHandler = new Handler(Looper.getMainLooper()); // Duplicate assignment
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
}