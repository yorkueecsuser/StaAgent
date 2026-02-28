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

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // This ensures the condition is always true, making the else block unreachable
  }
}