import android.support.annotation.UiThread;

class ObjWait {
  Object z;

  void waitOnAnyWithoutTimeoutOk() throws InterruptedException {
    synchronized (z) {
      z.wait();
    }
  }

  Object o;

  @UiThread
  void waitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (o) {
      o.wait();
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout1Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(5001);
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout2Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(4000, 2000000000);
    }
  }

  Object lock, x;

  @UiThread
  void indirectWaitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
    }
  }

  void lockAndWaitOnAnyWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
      synchronized (x) {
        x.wait();
      }
    }
  }

  Object y;

  @UiThread
  void indirectWaitSameLockOnMainOk() throws InterruptedException {
    synchronized (y) {
    }
  }

  void lockAndWaitSameLockOnAnyOk() throws InterruptedException {
    synchronized (y) {
      y.wait();
    }
  }

  // Mutated code
  Object a;

  void waitOnAnyWithoutTimeoutOkMutant() throws InterruptedException {
    synchronized (a) {
      a.wait();
    }
  }

  Object b;

  @UiThread
  void waitOnMainWithoutTimeoutBadMutant() throws InterruptedException {
    synchronized (b) {
      b.wait();
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout1BadMutant() throws InterruptedException {
    synchronized (b) {
      b.wait(5001);
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout2BadMutant() throws InterruptedException {
    synchronized (b) {
      b.wait(4000, 2000000000);
    }
  }

  Object c, d;

  @UiThread
  void indirectWaitOnMainWithoutTimeoutBadMutant() throws InterruptedException {
    synchronized (c) {
    }
  }

  void lockAndWaitOnAnyWithoutTimeoutBadMutant() throws InterruptedException {
    synchronized (c) {
      synchronized (d) {
        d.wait();
      }
    }
  }

  Object e;

  @UiThread
  void indirectWaitSameLockOnMainOkMutant() throws InterruptedException {
    synchronized (e) {
    }
  }

  void lockAndWaitSameLockOnAnyOkMutant() throws InterruptedException {
    synchronized (e) {
      e.wait();
    }
  }
}