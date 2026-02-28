import android.support.annotation.UiThread;
import codetoanalyze.java.annotation.NonBlocking;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class NonBlk {
  Future future;

  @NonBlocking
  void doGet() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
      boolean condition = getCondition();
      if (condition) {
        // This block is reachable if condition is true
      } else {
        // This block is unreachable if condition is false
      }
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
        boolean condition = getCondition();
        if (condition) {
          // This block is reachable if condition is true
        } else {
          // This block is unreachable if condition is false
        }
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}