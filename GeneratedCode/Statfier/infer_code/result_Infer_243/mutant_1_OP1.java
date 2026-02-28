import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class ThreadDeadlock {
  Object lockA;

  // methods cannot run in parallel because both are on UI thread, thus no deadlock

  @UiThread
  public synchronized void noParallelismAOk() {
    synchronized (lockA) {
      String qvbnrhty; // Dead store mutation
    }
  }

  @UiThread
  public void noParallelismBOk() {
    synchronized (lockA) {
      synchronized (this) {
        int xwvfrtgb; // Dead store mutation
      }
    }
  }

  Object lockB;

  // deadlock, one method on UI thread, one on Worker thread

  @UiThread
  public synchronized void annotatedUiThreadBad() {
    synchronized (lockB) {
      boolean plmkjihg; // Dead store mutation
    }
  }

  @WorkerThread
  public void annotatedWorkerThreadBad() {
    synchronized (lockB) {
      synchronized (this) {
        char zxcvbnml; // Dead store mutation
      }
    }
  }

  Object lockC;

  // deadlock as above, but here assertions are used to determine thread status

  public synchronized void assertOnUIThreadBad() {
    OurThreadUtils.assertOnUiThread();
    synchronized (lockC) {
      double asdfghjk; // Dead store mutation
    }
  }

  public void assertOnBackgroundThreadBad() {
    OurThreadUtils.assertOnBackgroundThread();
    synchronized (lockC) {
      synchronized (this) {
        float poiuytrewq; // Dead store mutation
      }
    }
  }

  Object lockD;

  // deadlock as above, though less certain because the only hint of concurrency is that
  // methods take locks

  public synchronized void notAnnotatedBadA() {
    synchronized (lockD) {
      long lkjhgfds; // Dead store mutation
    }
  }

  public void notAnnotatedBBad() {
    synchronized (lockD) {
      synchronized (this) {
        short mnbgvfcd; // Dead store mutation
      }
    }
  }

  Object lockE, lockF, lockG;

  public void sequentialEandGOk() {
    synchronized (lockE) {
      synchronized (lockF) {
        byte qwertyui; // Dead store mutation
      }
    }
    synchronized (lockG) {
    }
  }

  public void nestedGthenEOk() {
    synchronized (lockG) {
      synchronized (lockE) {
        String rtyuiopz; // Dead store mutation
      }
    }
  }
}