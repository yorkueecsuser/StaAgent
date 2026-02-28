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
  Executor mUiExecutorCopy = mUiThreadExecutor; // Duplicate assignment

  Executor mNonUiExecutor = Executors.getBackgroundExecutor();
  Executor mNonUiExecutorCopy = Executors.getBackgroundExecutor(); // Duplicate assignment

  Handler mUiHandler = new Handler(Looper.getMainLooper());
  Handler mUiHandlerCopy = new Handler(Looper.getMainLooper()); // Duplicate assignment

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
    mAmbiguous = mBadRunnable; // Duplicate assignment
  }

  ImplicitConstructor(int data) {
    mAmbiguous = mOkRunnable;
    mAmbiguous = mOkRunnable; // Duplicate assignment
  }

  public void postBlockingCallToUIExecutorBad() {
    mUiExecutor.execute(mBadRunnable);
    mUiExecutor.execute(mBadRunnable); // Duplicate assignment
  }

  public void postNoopCallToUIExecutorOk() {
    mUiExecutor.execute(mOkRunnable);
    mUiExecutor.execute(mOkRunnable); // Duplicate assignment
  }

  public void postBlockingCallToNonUIExecutorOk() {
    mNonUiExecutor.execute(mBadRunnable);
    mNonUiExecutor.execute(mBadRunnable); // Duplicate assignment
  }

  public void postBlockingCallToUIHandlerBad() {
    mUiHandler.post(mBadRunnable);
    mUiHandler.post(mBadRunnable); // Duplicate assignment
  }

  public void postAmbiguousRunnableToUIExecutorOk() {
    mUiExecutor.execute(mAmbiguous);
    mUiExecutor.execute(mAmbiguous); // Duplicate assignment
  }
}