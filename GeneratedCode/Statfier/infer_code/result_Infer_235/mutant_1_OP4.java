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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  ImplicitConstructor(int data) {
    mAmbiguous = mOkRunnable;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  public void postBlockingCallToUIExecutorBad() {
    mUiExecutor.execute(mBadRunnable);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  public void postNoopCallToUIExecutorOk() {
    mUiExecutor.execute(mOkRunnable);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  public void postBlockingCallToNonUIExecutorOk() {
    mNonUiExecutor.execute(mBadRunnable);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  public void postBlockingCallToUIHandlerBad() {
    mUiHandler.post(mBadRunnable);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  public void postAmbiguousRunnableToUIExecutorOk() {
    mUiExecutor.execute(mAmbiguous);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the else branch unreachable
  }
}