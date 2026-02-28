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
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
  }

  @UiThread
  @SuppressLint("someOtherString")
  void onUiThreadBad() throws InterruptedException, ExecutionException {
    future.get();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is another unreachable block.");
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
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is yet another unreachable block.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}