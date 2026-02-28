import android.support.annotation.UiThread;

class ObjWait {
  Object z;

  void waitOnAnyWithoutTimeoutOk() throws InterruptedException {
    synchronized (z) {
      z.wait();
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Some other unreachable code
    }
  }

  Object o;

  @UiThread
  void waitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (o) {
      o.wait();
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Some other unreachable code
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout1Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(5001);
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Some other unreachable code
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout2Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(4000, 2000000000);
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Some other unreachable code
    }
  }

  Object lock, x;

  @UiThread
  void indirectWaitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Some other unreachable code
    }
  }

  void lockAndWaitOnAnyWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
      synchronized (x) {
        x.wait();
      }
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Some other unreachable code
    }
  }

  Object y;

  @UiThread
  void indirectWaitSameLockOnMainOk() throws InterruptedException {
    synchronized (y) {
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Some other unreachable code
    }
  }

  void lockAndWaitSameLockOnAnyOk() throws InterruptedException {
    synchronized (y) {
      y.wait();
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Some other unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}