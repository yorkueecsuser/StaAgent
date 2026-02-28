import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class ThreadDeadlock {
  Object lockA;

  // methods cannot run in parallel because both are on UI thread, thus no deadlock

  @UiThread
  public synchronized void noParallelismAOk() {
    synchronized (lockA) {
      lockA = lockA; // Mutant: Duplicate assignment
    }
  }

  @UiThread
  public void noParallelismBOk() {
    synchronized (lockA) {
      synchronized (this) {
        lockA = lockA; // Mutant: Duplicate assignment
      }
    }
  }

  Object lockB;

  // deadlock, one method on UI thread, one on Worker thread

  @UiThread
  public synchronized void annotatedUiThreadBad() {
    synchronized (lockB) {
      lockB = lockB; // Mutant: Duplicate assignment
    }
  }

  @WorkerThread
  public void annotatedWorkerThreadBad() {
    synchronized (lockB) {
      synchronized (this) {
        lockB = lockB; // Mutant: Duplicate assignment
      }
    }
  }

  Object lockC;

  // deadlock as above, but here assertions are used to determine thread status

  public synchronized void assertOnUIThreadBad() {
    OurThreadUtils.assertOnUiThread();
    synchronized (lockC) {
      lockC = lockC; // Mutant: Duplicate assignment
    }
  }

  public void assertOnBackgroundThreadBad() {
    OurThreadUtils.assertOnBackgroundThread();
    synchronized (lockC) {
      synchronized (this) {
        lockC = lockC; // Mutant: Duplicate assignment
      }
    }
  }

  Object lockD;

  // deadlock as above, though less certain because the only hint of concurrency is that
  // methods take locks

  public synchronized void notAnnotatedBadA() {
    synchronized (lockD) {
      lockD = lockD; // Mutant: Duplicate assignment
    }
  }

  public void notAnnotatedBBad() {
    synchronized (lockD) {
      synchronized (this) {
        lockD = lockD; // Mutant: Duplicate assignment
      }
    }
  }

  Object lockE, lockF, lockG;

  public void sequentialEandGOk() {
    synchronized (lockE) {
      synchronized (lockF) {
        lockF = lockF; // Mutant: Duplicate assignment
      }
    }
    synchronized (lockG) {
      lockG = lockG; // Mutant: Duplicate assignment
    }
  }

  public void nestedGthenEOk() {
    synchronized (lockG) {
      synchronized (lockE) {
        lockE = lockE; // Mutant: Duplicate assignment
      }
    }
  }
}