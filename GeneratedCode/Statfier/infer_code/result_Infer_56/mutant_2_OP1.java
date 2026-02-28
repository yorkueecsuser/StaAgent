import android.support.annotation.UiThread;

class ObjWait {
  Object z;

  void waitOnAnyWithoutTimeoutOk() throws InterruptedException {
    synchronized (z) {
      z.wait();
    }
    // Dead Store Mutation
    String qjvbnrht = "unusedVariable";
  }

  Object o;

  @UiThread
  void waitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (o) {
      o.wait();
    }
    // Dead Store Mutation
    int kxwvfrty = 42;
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout1Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(5001);
    }
    // Dead Store Mutation
    boolean jhgfdsaz = true;
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout2Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(4000, 2000000000);
    }
    // Dead Store Mutation
    double cvbhnjmk = 3.14;
  }

  Object lock, x;

  @UiThread
  void indirectWaitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
    }
    // Dead Store Mutation
    char lmnbvcxz = 'a';
  }

  void lockAndWaitOnAnyWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
      synchronized (x) {
        x.wait();
      }
    }
    // Dead Store Mutation
    float wertuiop = 2.71f;
  }

  Object y;

  @UiThread
  void indirectWaitSameLockOnMainOk() throws InterruptedException {
    synchronized (y) {
    }
    // Dead Store Mutation
    long asdfghjk = 987654321L;
  }

  void lockAndWaitSameLockOnAnyOk() throws InterruptedException {
    synchronized (y) {
      y.wait();
    }
    // Dead Store Mutation
    short zxcvbnml = 1234;
  }
}