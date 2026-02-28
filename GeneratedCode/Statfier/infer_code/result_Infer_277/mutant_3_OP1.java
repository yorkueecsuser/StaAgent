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
    // Dead store mutation
    String qzjfnxrm = "unusedVariable";
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
          }
        };

    mOkRunnable =
        new Runnable() {
          @Override
          public void run() {}
        };
    // Dead store mutation
    int vbnrhtyq = 42;
  }

  public void postBlockingCallToUIExecutorBad() {
    mUiExecutor.execute(mBadRunnable);
    // Dead store mutation
    boolean xwqejkfl = true;
  }

  public void postNoopCallToUIExecutorOk() {
    mUiExecutor.execute(mOkRunnable);
    // Dead store mutation
    double jklmnopq = 3.14;
  }

  public void postBlockingCallToNonUIExecutorOk() {
    mNonUiExecutor.execute(mBadRunnable);
    // Dead store mutation
    char rstuvwxy = 'a';
  }

  public void postBlockingCallToUIHandlerBad() {
    mUiHandler.post(mBadRunnable);
    // Dead store mutation
    long zabcdefgh = 123456789L;
  }
}