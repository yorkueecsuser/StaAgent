import android.support.annotation.UiThread;

class ThreadCalls {
  void sleepOnAnyThreadOk() throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    Thread.sleep(60);
  }

  @UiThread
  void sleepOnUIThreadBad() throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    Thread.sleep(60);
  }

  Object lock;

  @UiThread
  void indirectSleepOnUIThreadBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (lock) {
    }
  }

  void lockAndSleepOnNonUIThread() throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (lock) {
      sleepOnAnyThreadOk();
    }
  }

  void joinOnAnyThreadOk(Thread thread) throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    thread.join();
  }

  @UiThread
  void joinOnUIThreadBad(Thread thread) throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    thread.join();
  }

  @UiThread
  void joinWithTimeout1OnUIThreadOk(Thread thread) throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    // 50 milliseconds
    thread.join(50);
  }

  @UiThread
  void joinWithTimeout2OnUIThreadOk(Thread thread) throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    // 500 milliseconds + 10000 nanoseconds
    thread.join(500, 10000);
  }

  Object joinLock;

  @UiThread
  void indirectJoinOnUIThreadBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (joinLock) {
    }
  }

  void lockAndSleepOnNonUIThread(Thread thread) throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (joinLock) {
      joinOnAnyThreadOk(thread);
    }
  }

  private boolean getCondition() {
    return false;
  }
}