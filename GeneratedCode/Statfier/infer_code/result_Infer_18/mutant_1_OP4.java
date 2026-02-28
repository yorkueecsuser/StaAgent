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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print");
    } else {
      // Alternative code that also should never run
      System.out.println("This should also never print");
    }
  }

  @UiThread
  @SuppressLint("someOtherString")
  void onUiThreadBad() throws InterruptedException, ExecutionException {
    future.get();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print in bad method");
    } else {
      // Alternative code that also should never run
      System.out.println("This should also never print in bad method");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

@SuppressLint("STARVATION")
class SuppLintClass {
  Future future;

  @UiThread
  void onUiThreadSuppressed() throws InterruptedException, ExecutionException {
    future.get();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print in class method");
    } else {
      // Alternative code that also should never run
      System.out.println("This should also never print in class method");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}