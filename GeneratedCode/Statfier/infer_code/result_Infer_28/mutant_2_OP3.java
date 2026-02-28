import com.google.common.util.concurrent.SettableFuture;

class NotUnderLock {
  SettableFuture future = null;

  private void callFutureSetOk() {
    future.set(null);
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      future.set("Unreachable");
    }
  }

  private synchronized void firstAcquisitionBad() {
    callFutureSetOk();
  }

  private void secondAcquisitionOk(Object o) {
    synchronized (o) {
      firstAcquisitionBad();
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, making the if block unreachable
  }
}