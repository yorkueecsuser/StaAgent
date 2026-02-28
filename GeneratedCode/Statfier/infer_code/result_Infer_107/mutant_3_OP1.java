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
    mNonUiExecutor = Executors.getBackgroundExecutor();
    mUiHandler = new Handler(Looper.getMainLooper());
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
    // Dead Store Mutation
    String jkdhfnvb = "unusedVariable";
  }

  public void postBlockingCallToUIExecutorBad() {
    mUiExecutor.execute(mBadRunnable);
    // Dead Store Mutation
    int qzjxwvbn = 42;
  }

  public void postNoopCallToUIExecutorOk() {
    mUiExecutor.execute(mOkRunnable);
    // Dead Store Mutation
    boolean rhtyujmn = true;
  }

  public void postBlockingCallToNonUIExecutorOk() {
    mNonUiExecutor.execute(mBadRunnable);
    // Dead Store Mutation
    double vbnrhtyu = 3.14;
  }

  public void postBlockingCallToUIHandlerBad() {
    mUiHandler.post(mBadRunnable);
    // Dead Store Mutation
    char yujmnbvc = 'a';
  }
}