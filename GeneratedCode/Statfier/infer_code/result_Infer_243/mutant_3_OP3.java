import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class ThreadDeadlock {
  Object lockA;

  // methods cannot run in parallel because both are on UI thread, thus no deadlock

  @UiThread
  public synchronized void noParallelismAOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    synchronized (lockA) {
    }
  }

  @UiThread
  public void noParallelismBOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    synchronized (lockA) {
      synchronized (this) {
      }
    }
  }

  Object lockB;

  // deadlock, one method on UI thread, one on Worker thread

  @UiThread
  public synchronized void annotatedUiThreadBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    synchronized (lockB) {
    }
  }

  @WorkerThread
  public void annotatedWorkerThreadBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    synchronized (lockB) {
      synchronized (this) {
      }
    }
  }

  Object lockC;

  // deadlock as above, but here assertions are used to determine thread status

  public synchronized void assertOnUIThreadBad() {
    OurThreadUtils.assertOnUiThread();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    synchronized (lockC) {
    }
  }

  public void assertOnBackgroundThreadBad() {
    OurThreadUtils.assertOnBackgroundThread();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    synchronized (lockC) {
      synchronized (this) {
      }
    }
  }

  Object lockD;

  // deadlock as above, though less certain because the only hint of concurrency is that
  // methods take locks

  public synchronized void notAnnotatedBadA() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    synchronized (lockD) {
    }
  }

  public void notAnnotatedBBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    synchronized (lockD) {
      synchronized (this) {
      }
    }
  }

  Object lockE, lockF, lockG;

  public void sequentialEandGOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    synchronized (lockE) {
      synchronized (lockF) {
      }
    }
    synchronized (lockG) {
    }
  }

  public void nestedGthenEOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
    }
    synchronized (lockG) {
      synchronized (lockE) {
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}