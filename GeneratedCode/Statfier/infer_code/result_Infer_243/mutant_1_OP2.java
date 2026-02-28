import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class ThreadDeadlock {
  Object lockA;

  // methods cannot run in parallel because both are on UI thread, thus no deadlock

  @UiThread
  public synchronized void noParallelismAOk() {
    synchronized (lockA) {
      lockA = lockA; // Mutation: Duplicate assignment
    }
  }

  @UiThread
  public void noParallelismBOk() {
    synchronized (lockA) {
      synchronized (this) {
        lockA = lockA; // Mutation: Duplicate assignment
      }
    }
  }

  Object lockB;

  // deadlock, one method on UI thread, one on Worker thread

  @UiThread
  public synchronized void annotatedUiThreadBad() {
    synchronized (lockB) {
      lockB = lockB; // Mutation: Duplicate assignment
    }
  }

  @WorkerThread
  public void annotatedWorkerThreadBad() {
    synchronized (lockB) {
      synchronized (this) {
        lockB = lockB; // Mutation: Duplicate assignment
      }
    }
  }

  Object lockC;

  // deadlock as above, but here assertions are used to determine thread status

  public synchronized void assertOnUIThreadBad() {
    OurThreadUtils.assertOnUiThread();
    synchronized (lockC) {
      lockC = lockC; // Mutation: Duplicate assignment
    }
  }

  public void assertOnBackgroundThreadBad() {
    OurThreadUtils.assertOnBackgroundThread();
    synchronized (lockC) {
      synchronized (this) {
        lockC = lockC; // Mutation: Duplicate assignment
      }
    }
  }

  Object lockD;

  // deadlock as above, though less certain because the only hint of concurrency is that
  // methods take locks

  public synchronized void notAnnotatedBadA() {
    synchronized (lockD) {
      lockD = lockD; // Mutation: Duplicate assignment
    }
  }

  public void notAnnotatedBBad() {
    synchronized (lockD) {
      synchronized (this) {
        lockD = lockD; // Mutation: Duplicate assignment
      }
    }
  }

  Object lockE, lockF, lockG;

  public void sequentialEandGOk() {
    synchronized (lockE) {
      synchronized (lockF) {
        lockF = lockF; // Mutation: Duplicate assignment
      }
    }
    synchronized (lockG) {
      lockG = lockG; // Mutation: Duplicate assignment
    }
  }

  public void nestedGthenEOk() {
    synchronized (lockG) {
      synchronized (lockE) {
        lockE = lockE; // Mutation: Duplicate assignment
      }
    }
  }
}