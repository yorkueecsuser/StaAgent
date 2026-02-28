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
            boolean condition = getCondition();
            switch (condition) {
              case true:
                // This case is reachable if condition is true
                break;
              default:
                // This default case is unreachable because condition is always false
                break;
            }
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
            boolean condition = getCondition();
            switch (condition) {
              case true:
                // This case is reachable if condition is true
                break;
              default:
                // This default case is unreachable because condition is always false
                break;
            }
            synchronized (monitorB) {
              synchronized (monitorA) {
              }
            }
          }
        });
  }

  private boolean getCondition() {
    return false;
  }
}