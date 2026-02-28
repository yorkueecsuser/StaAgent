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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
        }
      };

  Runnable mOkRunnable =
      new Runnable() {
        @Override
        public void run() {
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
        }
      };

  Runnable mAmbiguous;

  ImplicitConstructor() {
    mAmbiguous = mBadRunnable;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  ImplicitConstructor(int data) {
    mAmbiguous = mOkRunnable;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void postBlockingCallToUIExecutorBad() {
    mUiExecutor.execute(mBadRunnable);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void postNoopCallToUIExecutorOk() {
    mUiExecutor.execute(mOkRunnable);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void postBlockingCallToNonUIExecutorOk() {
    mNonUiExecutor.execute(mBadRunnable);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void postBlockingCallToUIHandlerBad() {
    mUiHandler.post(mBadRunnable);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void postAmbiguousRunnableToUIExecutorOk() {
    mUiExecutor.execute(mAmbiguous);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}