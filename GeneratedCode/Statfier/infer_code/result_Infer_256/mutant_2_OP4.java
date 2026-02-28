import android.support.annotation.UiThread;

class ThreadCalls {
  void sleepOnAnyThreadOk() throws InterruptedException {
    Thread.sleep(60);
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @UiThread
  void sleepOnUIThreadBad() throws InterruptedException {
    Thread.sleep(60);
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  Object lock;

  @UiThread
  void indirectSleepOnUIThreadBad() {
    synchronized (lock) {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable else branch
      }
    }
  }

  void lockAndSleepOnNonUIThread() throws InterruptedException {
    synchronized (lock) {
      sleepOnAnyThreadOk();
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable else branch
      }
    }
  }

  void joinOnAnyThreadOk(Thread thread) throws InterruptedException {
    thread.join();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @UiThread
  void joinOnUIThreadBad(Thread thread) throws InterruptedException {
    thread.join();
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @UiThread
  void joinWithTimeout1OnUIThreadOk(Thread thread) throws InterruptedException {
    // 50 milliseconds
    thread.join(50);
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  @UiThread
  void joinWithTimeout2OnUIThreadOk(Thread thread) throws InterruptedException {
    // 500 milliseconds + 10000 nanoseconds
    thread.join(500, 10000);
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else branch
    }
  }

  Object joinLock;

  @UiThread
  void indirectJoinOnUIThreadBad() {
    synchronized (joinLock) {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable else branch
      }
    }
  }

  void lockAndSleepOnNonUIThread(Thread thread) throws InterruptedException {
    synchronized (joinLock) {
      joinOnAnyThreadOk(thread);
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable else branch
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}