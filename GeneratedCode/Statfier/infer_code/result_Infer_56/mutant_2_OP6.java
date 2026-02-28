import android.support.annotation.UiThread;

class ObjWait {
  Object z;

  void waitOnAnyWithoutTimeoutOk() throws InterruptedException {
    synchronized (z) {
      z.wait();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  Object o;

  @UiThread
  void waitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (o) {
      o.wait();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout1Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(5001);
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout2Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(4000, 2000000000);
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  Object lock, x;

  @UiThread
  void indirectWaitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  void lockAndWaitOnAnyWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
      synchronized (x) {
        x.wait();
      }
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  Object y;

  @UiThread
  void indirectWaitSameLockOnMainOk() throws InterruptedException {
    synchronized (y) {
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  void lockAndWaitSameLockOnAnyOk() throws InterruptedException {
    synchronized (y) {
      y.wait();
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}