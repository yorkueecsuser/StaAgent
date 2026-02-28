import android.support.annotation.UiThread;

class ThreadCalls {
  void sleepOnAnyThreadOk() throws InterruptedException {
    Thread.sleep(60);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @UiThread
  void sleepOnUIThreadBad() throws InterruptedException {
    Thread.sleep(60);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  Object lock;

  @UiThread
  void indirectSleepOnUIThreadBad() {
    synchronized (lock) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  void lockAndSleepOnNonUIThread() throws InterruptedException {
    synchronized (lock) {
      sleepOnAnyThreadOk();
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  void joinOnAnyThreadOk(Thread thread) throws InterruptedException {
    thread.join();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @UiThread
  void joinOnUIThreadBad(Thread thread) throws InterruptedException {
    thread.join();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @UiThread
  void joinWithTimeout1OnUIThreadOk(Thread thread) throws InterruptedException {
    // 50 milliseconds
    thread.join(50);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @UiThread
  void joinWithTimeout2OnUIThreadOk(Thread thread) throws InterruptedException {
    // 500 milliseconds + 10000 nanoseconds
    thread.join(500, 10000);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  Object joinLock;

  @UiThread
  void indirectJoinOnUIThreadBad() {
    synchronized (joinLock) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  void lockAndSleepOnNonUIThread(Thread thread) throws InterruptedException {
    synchronized (joinLock) {
      joinOnAnyThreadOk(thread);
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}