import com.google.common.util.concurrent.SettableFuture;

class NotUnderLock {
  SettableFuture future = null;

  private void callFutureSetOk() {
    future.set(null);
  }

  private synchronized void firstAcquisitionBad() {
    callFutureSetOk();
  }

  private void secondAcquisitionOk(Object o) {
    synchronized (o) {
      firstAcquisitionBad();
    }
  }

  // Mutated code
  private void callFutureSetOkMutant() {
    future.set(null);
  }

  private synchronized void firstAcquisitionBadMutant() {
    callFutureSetOkMutant();
  }

  private void secondAcquisitionOkMutant(a o) {
    synchronized (o) {
      firstAcquisitionBadMutant();
    }
  }
}