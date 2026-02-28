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
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This is an unreachable case");
        break;
    }
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

  private boolean getUnreachableCondition() {
    return false;
  }
}