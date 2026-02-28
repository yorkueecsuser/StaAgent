import android.support.annotation.UiThread;

class ThreadCalls {
  void sleepOnAnyThreadOk() throws InterruptedException {
    Thread.sleep(60);
  }

  @UiThread
  void sleepOnUIThreadBad() throws InterruptedException {
    Thread.sleep(60);
  }

  Object lock;

  @UiThread
  void indirectSleepOnUIThreadBad() {
    synchronized (lock) {
    }
  }

  void lockAndSleepOnNonUIThread() throws InterruptedException {
    synchronized (lock) {
      sleepOnAnyThreadOk();
    }
  }

  void joinOnAnyThreadOk(Thread thread) throws InterruptedException {
    thread.join();
  }

  @UiThread
  void joinOnUIThreadBad(Thread thread) throws InterruptedException {
    thread.join();
  }

  @UiThread
  void joinWithTimeout1OnUIThreadOk(Thread thread) throws InterruptedException {
    // 50 milliseconds
    thread.join(50);
  }

  @UiThread
  void joinWithTimeout2OnUIThreadOk(Thread thread) throws InterruptedException {
    // 500 milliseconds + 10000 nanoseconds
    thread.join(500, 10000);
  }

  Object joinLock;

  @UiThread
  void indirectJoinOnUIThreadBad() {
    synchronized (joinLock) {
    }
  }

  void lockAndSleepOnNonUIThread(Thread thread) throws InterruptedException {
    synchronized (joinLock) {
      joinOnAnyThreadOk(thread);
    }
  }

  // Mutated code starts here

  void sleepOnAnyThreadOkMutant() throws InterruptedException {
    Thread.sleep(60);
  }

  @UiThread
  void sleepOnUIThreadBadMutant() throws InterruptedException {
    Thread.sleep(60);
  }

  Object x;

  @UiThread
  void indirectSleepOnUIThreadBadMutant() {
    synchronized (x) {
    }
  }

  void lockAndSleepOnNonUIThreadMutant() throws InterruptedException {
    synchronized (x) {
      sleepOnAnyThreadOkMutant();
    }
  }

  void joinOnAnyThreadOkMutant(Thread y) throws InterruptedException {
    y.join();
  }

  @UiThread
  void joinOnUIThreadBadMutant(Thread y) throws InterruptedException {
    y.join();
  }

  @UiThread
  void joinWithTimeout1OnUIThreadOkMutant(Thread y) throws InterruptedException {
    // 50 milliseconds
    y.join(50);
  }

  @UiThread
  void joinWithTimeout2OnUIThreadOkMutant(Thread y) throws InterruptedException {
    // 500 milliseconds + 10000 nanoseconds
    y.join(500, 10000);
  }

  Object z;

  @UiThread
  void indirectJoinOnUIThreadBadMutant() {
    synchronized (z) {
    }
  }

  void lockAndSleepOnNonUIThreadMutant(Thread y) throws InterruptedException {
    synchronized (z) {
      joinOnAnyThreadOkMutant(y);
    }
  }
}