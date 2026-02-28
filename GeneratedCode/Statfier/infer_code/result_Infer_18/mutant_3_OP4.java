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
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // Alternative code that also will never execute due to the same reason
    }
  }

  @UiThread
  @SuppressLint("someOtherString")
  void onUiThreadBad() throws InterruptedException, ExecutionException {
    future.get();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // Alternative code that also will never execute due to the same reason
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

@SuppressLint("STARVATION")
class SuppLintClass {
  Future future;

  @UiThread
  void onUiThreadSuppressed() throws InterruptedException, ExecutionException {
    future.get();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // Alternative code that also will never execute due to the same reason
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}