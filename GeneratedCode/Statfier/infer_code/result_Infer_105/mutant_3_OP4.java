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
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // Original code
              synchronized (monitorA) {
                synchronized (monitorB) {
                }
              }
            } else {
              // Unreachable if-else branch
              System.out.println("This is an unreachable else block in BGThread");
            }
          }
        });
  }

  void scheduleOnUIThread() {
    post(
        new Runnable() {
          @Override
          public void run() {
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // Original code
              synchronized (monitorB) {
                synchronized (monitorA) {
                }
              }
            } else {
              // Unreachable if-else branch
              System.out.println("This is an unreachable else block in UIThread");
            }
          }
        });
  }

  private boolean getCondition() {
    // This method can be used to dynamically determine the condition
    return true; // Always returns true to ensure the original code path is taken
  }
}