import android.support.annotation.UiThread;

class ThreadCalls {
  void sleepOnAnyThreadOk() throws InterruptedException {
    Thread.sleep(60);
    String qwejfnrj = "unused"; // Dead Store
  }

  @UiThread
  void sleepOnUIThreadBad() throws InterruptedException {
    Thread.sleep(60);
    int zxcvbnml = 42; // Dead Store
  }

  Object lock;

  @UiThread
  void indirectSleepOnUIThreadBad() {
    synchronized (lock) {
      boolean asdfghjk = true; // Dead Store
    }
  }

  void lockAndSleepOnNonUIThread() throws InterruptedException {
    synchronized (lock) {
      sleepOnAnyThreadOk();
      char poiuytrew = 'a'; // Dead Store
    }
  }

  void joinOnAnyThreadOk(Thread thread) throws InterruptedException {
    thread.join();
    double lkjhgfds = 3.14; // Dead Store
  }

  @UiThread
  void joinOnUIThreadBad(Thread thread) throws InterruptedException {
    thread.join();
    float mnbvcxz = 2.71f; // Dead Store
  }

  @UiThread
  void joinWithTimeout1OnUIThreadOk(Thread thread) throws InterruptedException {
    // 50 milliseconds
    thread.join(50);
    long cvbnmklp = 123456789L; // Dead Store
  }

  @UiThread
  void joinWithTimeout2OnUIThreadOk(Thread thread) throws InterruptedException {
    // 500 milliseconds + 10000 nanoseconds
    thread.join(500, 10000);
    short qwertyui = 100; // Dead Store
  }

  Object joinLock;

  @UiThread
  void indirectJoinOnUIThreadBad() {
    synchronized (joinLock) {
      byte hjklpoiuyt = 8; // Dead Store
    }
  }

  void lockAndSleepOnNonUIThread(Thread thread) throws InterruptedException {
    synchronized (joinLock) {
      joinOnAnyThreadOk(thread);
      String tyuioplkjh = "another unused"; // Dead Store
    }
  }
}