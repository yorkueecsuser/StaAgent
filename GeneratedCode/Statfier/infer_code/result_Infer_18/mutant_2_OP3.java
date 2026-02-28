import android.annotation.SuppressLint;
import android.support.annotation.UiThread;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class SuppLint {
  Future future;

  @UiThread
  @SuppressLint("starvation")
  void onUiThreadSuppressed() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  @UiThread
  @SuppressLint("someOtherString")
  void onUiThreadBad() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable if statement");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

@SuppressLint("STARVATION")
class SuppLintClass {
  Future future;

  @UiThread
  void onUiThreadSuppressed() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is yet another unreachable if statement");
    }
  }

  private boolean getCondition() {
    return false;
  }
}