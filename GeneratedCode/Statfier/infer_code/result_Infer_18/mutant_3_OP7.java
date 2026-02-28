import android.annotation.SuppressLint;
import android.support.annotation.UiThread;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class SuppLint {
  Future future;

  @UiThread
  @SuppressLint("starvation")
  void onUiThreadSuppressed() throws InterruptedException, ExecutionException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    future.get();
  }

  @UiThread
  @SuppressLint("someOtherString")
  void onUiThreadBad() throws InterruptedException, ExecutionException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    future.get();
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    future.get();
  }

  private boolean getCondition() {
    return false;
  }
}