import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class ThreadDeadlock {
  Object lockA;

  // methods cannot run in parallel because both are on UI thread, thus no deadlock

  @UiThread
  public synchronized void noParallelismAOk() {
    synchronized (lockA) {
      String qjvbnrht = "unused"; // Dead Store
    }
  }

  @UiThread
  public void noParallelismBOk() {
    synchronized (lockA) {
      synchronized (this) {
        int xwqplmfn = 0; // Dead Store
      }
    }
  }

  Object lockB;

  // deadlock, one method on UI thread, one on Worker thread

  @UiThread
  public synchronized void annotatedUiThreadBad() {
    synchronized (lockB) {
      boolean kxvbnrht = true; // Dead Store
    }
  }

  @WorkerThread
  public void annotatedWorkerThreadBad() {
    synchronized (lockB) {
      synchronized (this) {
        double zjvbnrht = 3.14; // Dead Store
      }
    }
  }

  Object lockC;

  // deadlock as above, but here assertions are used to determine thread status

  public synchronized void assertOnUIThreadBad() {
    OurThreadUtils.assertOnUiThread();
    synchronized (lockC) {
      char vjvbnrht = 'a'; // Dead Store
    }
  }

  public void assertOnBackgroundThreadBad() {
    OurThreadUtils.assertOnBackgroundThread();
    synchronized (lockC) {
      synchronized (this) {
        float yjvbnrht = 1.2f; // Dead Store
      }
    }
  }

  Object lockD;

  // deadlock as above, though less certain because the only hint of concurrency is that
  // methods take locks

  public synchronized void notAnnotatedBadA() {
    synchronized (lockD) {
      long rjvbnrht = 123456789L; // Dead Store
    }
  }

  public void notAnnotatedBBad() {
    synchronized (lockD) {
      synchronized (this) {
        short sjvbnrht = 123; // Dead Store
      }
    }
  }

  Object lockE, lockF, lockG;

  public void sequentialEandGOk() {
    synchronized (lockE) {
      synchronized (lockF) {
        byte tjvbnrht = 1; // Dead Store
      }
    }
    synchronized (lockG) {
    }
  }

  public void nestedGthenEOk() {
    synchronized (lockG) {
      synchronized (lockE) {
        String ujvbnrht = "another unused"; // Dead Store
      }
    }
  }
}