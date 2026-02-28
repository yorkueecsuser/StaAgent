import com.google.common.util.concurrent.SettableFuture;

class NotUnderLock {
  SettableFuture future = null;

  private void callFutureSetOk() {
    future.set(null);
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private synchronized void firstAcquisitionBad() {
    callFutureSetOk();
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private void secondAcquisitionOk(Object o) {
    synchronized (o) {
      firstAcquisitionBad();
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  // Method to provide dynamic condition
  private boolean getCondition() {
    return false;
  }
}