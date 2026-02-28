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
    // Mutant code start
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
    // Mutant code end
  }

  @UiThread
  @SuppressLint("someOtherString")
  void onUiThreadBad() throws InterruptedException, ExecutionException {
    future.get();
    // Mutant code start
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is another unreachable case");
        break;
    }
    // Mutant code end
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}

@SuppressLint("STARVATION")
class SuppLintClass {
  Future future;

  @UiThread
  void onUiThreadSuppressed() throws InterruptedException, ExecutionException {
    future.get();
    // Mutant code start
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is not set to true
        System.out.println("This is yet another unreachable case");
        break;
    }
    // Mutant code end
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}