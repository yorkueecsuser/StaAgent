import com.google.common.util.concurrent.SettableFuture;

class NotUnderLock {
  SettableFuture future = null;

  private void callFutureSetOk() {
    future.set(null);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run because shouldRun is always false
      System.out.println("This is an unreachable if block");
    } else {
      // Some alternative code that will never run either
      System.out.println("This is an unreachable else block");
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

  private boolean getCondition() {
    return false;
  }
}