import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import java.util.concurrent.Executor;

class ConstructedAttributes {
  static Binder binder;

  private static void doTransact() {
    try {
      binder.transact(0, null, null, 0);
    } catch (RemoteException e) {
    }
  }

  @ForUiThread private final Executor mUiThreadExecutor = null;

  Executor mUiExecutor;
  Executor mNonUiExecutor;
  Handler mUiHandler;
  Runnable mBadRunnable;
  Runnable mOkRunnable;

  ConstructedAttributes() {
    mUiExecutor = mUiThreadExecutor;
    mNonUiExecutor = Executors.getBackgroundExecutor();
    mUiHandler = new Handler(Looper.getMainLooper());
    mBadRunnable =
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

    mOkRunnable =
        new Runnable() {
          @Override
          public void run() {}
        };
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

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}