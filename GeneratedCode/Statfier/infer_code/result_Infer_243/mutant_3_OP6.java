import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class ThreadDeadlock {
  Object lockA;

  // methods cannot run in parallel because both are on UI thread, thus no deadlock

  @UiThread
  public synchronized void noParallelismAOk() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable for loop
    }
    synchronized (lockA) {
    }
  }

  @UiThread
  public void noParallelismBOk() {
    synchronized (lockA) {
      synchronized (this) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // unreachable for loop
        }
      }
    }
  }

  Object lockB;

  // deadlock, one method on UI thread, one on Worker thread

  @UiThread
  public synchronized void annotatedUiThreadBad() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable for loop
    }
    synchronized (lockB) {
    }
  }

  @WorkerThread
  public void annotatedWorkerThreadBad() {
    synchronized (lockB) {
      synchronized (this) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // unreachable for loop
        }
      }
    }
  }

  Object lockC;

  // deadlock as above, but here assertions are used to determine thread status

  public synchronized void assertOnUIThreadBad() {
    OurThreadUtils.assertOnUiThread();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable for loop
    }
    synchronized (lockC) {
    }
  }

  public void assertOnBackgroundThreadBad() {
    OurThreadUtils.assertOnBackgroundThread();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable for loop
    }
    synchronized (lockD) {
    }
  }

  public void notAnnotatedBBad() {
    synchronized (lockD) {
      synchronized (this) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // unreachable for loop
        }
      }
    }
  }

  Object lockE, lockF, lockG;

  public void sequentialEandGOk() {
    synchronized (lockE) {
      synchronized (lockF) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // unreachable for loop
        }
      }
    }
    synchronized (lockG) {
    }
  }

  public void nestedGthenEOk() {
    synchronized (lockG) {
      synchronized (lockE) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // unreachable for loop
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}