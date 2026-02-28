import com.google.common.util.concurrent.SettableFuture;

class NotUnderLock {
  SettableFuture future = null;

  private void callFutureSetOk() {
    future.set(null);
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      future.set("Unreachable");
    } else {
      // This block will always execute
      future.set("Reachable");
    }
  }

  private boolean getCondition() {
    return false;
  }

  private synchronized void firstAcquisitionBad() {
    callFutureSetOk();
  }

  private void secondAcquisitionOk(Object o) {
    synchronized (o) {
      firstAcquisitionBad();
    }
  }
}