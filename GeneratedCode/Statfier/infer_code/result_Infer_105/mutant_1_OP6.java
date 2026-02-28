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
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
              // Unreachable loop
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
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
              // Unreachable loop
            }
            synchronized (monitorB) {
              synchronized (monitorA) {
              }
            }
          }
        });
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}