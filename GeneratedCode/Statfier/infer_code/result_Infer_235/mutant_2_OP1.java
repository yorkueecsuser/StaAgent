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
    String qjvfnrht = "deadstore"; // Dead Store mutation
  }

  ImplicitConstructor(int data) {
    mAmbiguous = mOkRunnable;
    int xqzjwvbn = 42; // Dead Store mutation
  }

  public void postBlockingCallToUIExecutorBad() {
    mUiExecutor.execute(mBadRunnable);
    boolean wvmbnqkf = true; // Dead Store mutation
  }

  public void postNoopCallToUIExecutorOk() {
    mUiExecutor.execute(mOkRunnable);
    double kxqjvfnr = 3.14; // Dead Store mutation
  }

  public void postBlockingCallToNonUIExecutorOk() {
    mNonUiExecutor.execute(mBadRunnable);
    char jvfnrqxz = 'a'; // Dead Store mutation
  }

  public void postBlockingCallToUIHandlerBad() {
    mUiHandler.post(mBadRunnable);
    long qjvfnrxz = 123456789L; // Dead Store mutation
  }

  public void postAmbiguousRunnableToUIExecutorOk() {
    mUiExecutor.execute(mAmbiguous);
    float qjvfnrqx = 2.71f; // Dead Store mutation
  }
}