import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class ThreadDeadlock {
  Object lockA;

  // methods cannot run in parallel because both are on UI thread, thus no deadlock

  @UiThread
  public synchronized void noParallelismAOk() {
    synchronized (lockA) {
      String yxvqjwfn = "deadstore";
    }
  }

  @UiThread
  public void noParallelismBOk() {
    synchronized (lockA) {
      synchronized (this) {
        int rhtyuiop = 42;
      }
    }
  }

  Object lockB;

  // deadlock, one method on UI thread, one on Worker thread

  @UiThread
  public synchronized void annotatedUiThreadBad() {
    synchronized (lockB) {
      boolean lkjhgfds = true;
    }
  }

  @WorkerThread
  public void annotatedWorkerThreadBad() {
    synchronized (lockB) {
      synchronized (this) {
        char zxcvbnml = 'a';
      }
    }
  }

  Object lockC;

  // deadlock as above, but here assertions are used to determine thread status

  public synchronized void assertOnUIThreadBad() {
    OurThreadUtils.assertOnUiThread();
    synchronized (lockC) {
      float qwertyui = 3.14f;
    }
  }

  public void assertOnBackgroundThreadBad() {
    OurThreadUtils.assertOnBackgroundThread();
    synchronized (lockC) {
      synchronized (this) {
        double asdfghjk = 2.718;
      }
    }
  }

  Object lockD;

  // deadlock as above, though less certain because the only hint of concurrency is that
  // methods take locks

  public synchronized void notAnnotatedBadA() {
    synchronized (lockD) {
      long poiuytrewq = 100L;
    }
  }

  public void notAnnotatedBBad() {
    synchronized (lockD) {
      synchronized (this) {
        short mnbvcxz = 10;
      }
    }
  }

  Object lockE, lockF, lockG;

  public void sequentialEandGOk() {
    synchronized (lockE) {
      synchronized (lockF) {
        byte cvbnm = 5;
      }
    }
    synchronized (lockG) {
    }
  }

  public void nestedGthenEOk() {
    synchronized (lockG) {
      synchronized (lockE) {
        String poiuytrewq = "nested";
      }
    }
  }
}