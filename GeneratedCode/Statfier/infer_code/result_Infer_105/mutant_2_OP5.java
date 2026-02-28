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
                // Introduced unreachable switch statement
                boolean alwaysFalse = getAlwaysFalse();
                switch (alwaysFalse) {
                  case true:
                    // This case is unreachable
                    System.out.println("This is unreachable");
                    break;
                }
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
                // Introduced unreachable switch statement
                boolean alwaysFalse = getAlwaysFalse();
                switch (alwaysFalse) {
                  case true:
                    // This case is unreachable
                    System.out.println("This is unreachable");
                    break;
                }
              }
            }
          }
        });
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}