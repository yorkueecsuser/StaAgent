import com.google.common.util.concurrent.SettableFuture;

class NotUnderLock {
  SettableFuture future = null;

  private void callFutureSetOk() {
    future.set(null);
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      future.set("Unreachable");
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
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