import android.support.annotation.UiThread;
import codetoanalyze.java.annotation.NonBlocking;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class NonBlk {
  Future future;

  @NonBlocking
  void doGet() throws InterruptedException, ExecutionException {
    future.get();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  @UiThread
  void onUiThreadIndirectOk() throws InterruptedException, ExecutionException {
    doGet();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadDirectOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  @NonBlocking
  synchronized void deadlockABBad() {
    synchronized (future) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
      } else {
        // Alternative code that should also never run
      }
    }
  }

  @NonBlocking
  void deadlockBABad() {
    synchronized (future) {
      synchronized (this) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should never run
        } else {
          // Alternative code that should also never run
        }
      }
    }
  }

  private void privateDoGetOk() throws InterruptedException, ExecutionException {
    future.get();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  @NonBlocking
  @UiThread
  void onUiThreadCalleeOk() throws InterruptedException, ExecutionException {
    privateDoGetOk();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Alternative code that should also never run
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}