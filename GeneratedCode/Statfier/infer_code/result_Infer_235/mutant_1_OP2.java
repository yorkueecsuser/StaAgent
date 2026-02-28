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
  @ForUiThread private final Executor mUiThreadExecutorDuplicate = null; // Mutant

  Executor mUiExecutor = mUiThreadExecutor;
  Executor mUiExecutorDuplicate = mUiThreadExecutor; // Mutant
  Executor mNonUiExecutor = Executors.getBackgroundExecutor();
  Executor mNonUiExecutorDuplicate = Executors.getBackgroundExecutor(); // Mutant
  Handler mUiHandler = new Handler(Looper.getMainLooper());
  Handler mUiHandlerDuplicate = new Handler(Looper.getMainLooper()); // Mutant
  Runnable mBadRunnable =
      new Runnable() {
        @Override
        public void run() {
          doTransact();
        }
      };
  Runnable mBadRunnableDuplicate =
      new Runnable() {
        @Override
        public void run() {
          doTransact();
        }
      }; // Mutant

  Runnable mOkRunnable =
      new Runnable() {
        @Override
        public void run() {}
      };
  Runnable mOkRunnableDuplicate =
      new Runnable() {
        @Override
        public void run() {}
      }; // Mutant

  Runnable mAmbiguous;
  Runnable mAmbiguousDuplicate; // Mutant

  ImplicitConstructor() {
    mAmbiguous = mBadRunnable;
    mAmbiguousDuplicate = mBadRunnable; // Mutant
  }

  ImplicitConstructor(int data) {
    mAmbiguous = mOkRunnable;
    mAmbiguousDuplicate = mOkRunnable; // Mutant
  }

  public void postBlockingCallToUIExecutorBad() {
    mUiExecutor.execute(mBadRunnable);
    mUiExecutorDuplicate.execute(mBadRunnable); // Mutant
  }

  public void postNoopCallToUIExecutorOk() {
    mUiExecutor.execute(mOkRunnable);
    mUiExecutorDuplicate.execute(mOkRunnable); // Mutant
  }

  public void postBlockingCallToNonUIExecutorOk() {
    mNonUiExecutor.execute(mBadRunnable);
    mNonUiExecutorDuplicate.execute(mBadRunnable); // Mutant
  }

  public void postBlockingCallToUIHandlerBad() {
    mUiHandler.post(mBadRunnable);
    mUiHandlerDuplicate.post(mBadRunnable); // Mutant
  }

  public void postAmbiguousRunnableToUIExecutorOk() {
    mUiExecutor.execute(mAmbiguous);
    mUiExecutorDuplicate.execute(mAmbiguous); // Mutant
  }
}