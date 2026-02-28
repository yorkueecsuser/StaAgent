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
            switch (condition? 0 : 1) { // Unreachable switch statement
              case 0:
                System.out.println("This is unreachable");
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
            switch (condition? 0 : 1) { // Unreachable switch statement
              case 0:
                System.out.println("This is unreachable");
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
    return false; // This method ensures the switch condition is dynamically determined
  }
}