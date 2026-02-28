import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class ThreadDeadlock {
  Object lockA;

  // methods cannot run in parallel because both are on UI thread, thus no deadlock

  @UiThread
  public synchronized void noParallelismAOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
    synchronized (lockA) {
    }
  }

  @UiThread
  public void noParallelismBOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
    synchronized (lockB) {
    }
  }

  @WorkerThread
  public void annotatedWorkerThreadBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
    synchronized (lockC) {
    }
  }

  public void assertOnBackgroundThreadBad() {
    OurThreadUtils.assertOnBackgroundThread();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
    synchronized (lockD) {
    }
  }

  public void notAnnotatedBBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
    synchronized (lockD) {
      synchronized (this) {
      }
    }
  }

  Object lockE, lockF, lockG;

  public void sequentialEandGOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
    synchronized (lockE) {
      synchronized (lockF) {
      }
    }
    synchronized (lockG) {
    }
  }

  public void nestedGthenEOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
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