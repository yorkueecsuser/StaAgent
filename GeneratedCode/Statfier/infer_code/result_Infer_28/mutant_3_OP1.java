import com.google.common.util.concurrent.SettableFuture;

class NotUnderLock {
  SettableFuture future = null;

  private void callFutureSetOk() {
    future.set(null);
    // Dead Store Mutation
    String abcdexyz = "unusedVariable";
  }

  private synchronized void firstAcquisitionBad() {
    callFutureSetOk();
  }

  private void secondAcquisitionOk(Object o) {
    synchronized (o) {
      firstAcquisitionBad();
      // Dead Store Mutation
      int fghijklm = 42;
    }
  }
}