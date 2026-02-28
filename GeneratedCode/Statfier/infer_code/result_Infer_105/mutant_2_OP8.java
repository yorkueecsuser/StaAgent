import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

class MyView extends View {
  MyView(Context c) {
    super(c);
  }

  Object monitorA, monitorB;
  @ForNonUiThread private final Executor mNonUiThreadExecutor = null;

  void scheduleOnBGThread() {
    mNonUiThreadExecutor.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorA) {
              synchronized (monitorB) {
              }
            }
          }
        });
  }

  void scheduleOnUIThread() {
    post(
        new Runnable() {
          @Override
          public void run() {
            synchronized (monitorB) {
              synchronized (monitorA) {
              }
            }
          }
        });
  }

  // Mutated code
  Object x, y;
  @ForNonUiThread private final Executor z = null;

  void scheduleOnBGThreadMutant() {
    z.execute(
        new Runnable() {
          @Override
          public void run() {
            synchronized (x) {
              synchronized (y) {
              }
            }
          }
        });
  }

  void scheduleOnUIThreadMutant() {
    post(
        new Runnable() {
          @Override
          public void run() {
            synchronized (y) {
              synchronized (x) {
              }
            }
          }
        });
  }
}