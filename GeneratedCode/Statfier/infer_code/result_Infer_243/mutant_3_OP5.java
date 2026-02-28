import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;

class ThreadDeadlock {
  Object lockA;

  // methods cannot run in parallel because both are on UI thread, thus no deadlock

  @UiThread
  public synchronized void noParallelismAOk() {
    synchronized (lockA) {
      boolean condition = getCondition();
      switch (condition? 1 : 0) {
        case 2: // This case will never be reached
          System.out.println("Unreachable case");
          break;
      }
    }
  }

  @UiThread
  public void noParallelismBOk() {
    synchronized (lockA) {
      synchronized (this) {
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
          case 2: // This case will never be reached
            System.out.println("Unreachable case");
            break;
        }
      }
    }
  }

  Object lockB;

  // deadlock, one method on UI thread, one on Worker thread

  @UiThread
  public synchronized void annotatedUiThreadBad() {
    synchronized (lockB) {
      boolean condition = getCondition();
      switch (condition? 1 : 0) {
        case 2: // This case will never be reached
          System.out.println("Unreachable case");
          break;
      }
    }
  }

  @WorkerThread
  public void annotatedWorkerThreadBad() {
    synchronized (lockB) {
      synchronized (this) {
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
          case 2: // This case will never be reached
            System.out.println("Unreachable case");
            break;
        }
      }
    }
  }

  Object lockC;

  // deadlock as above, but here assertions are used to determine thread status

  public synchronized void assertOnUIThreadBad() {
    OurThreadUtils.assertOnUiThread();
    synchronized (lockC) {
      boolean condition = getCondition();
      switch (condition? 1 : 0) {
        case 2: // This case will never be reached
          System.out.println("Unreachable case");
          break;
      }
    }
  }

  public void assertOnBackgroundThreadBad() {
    OurThreadUtils.assertOnBackgroundThread();
    synchronized (lockC) {
      synchronized (this) {
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
          case 2: // This case will never be reached
            System.out.println("Unreachable case");
            break;
        }
      }
    }
  }

  Object lockD;

  // deadlock as above, though less certain because the only hint of concurrency is that
  // methods take locks

  public synchronized void notAnnotatedBadA() {
    synchronized (lockD) {
      boolean condition = getCondition();
      switch (condition? 1 : 0) {
        case 2: // This case will never be reached
          System.out.println("Unreachable case");
          break;
      }
    }
  }

  public void notAnnotatedBBad() {
    synchronized (lockD) {
      synchronized (this) {
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
          case 2: // This case will never be reached
            System.out.println("Unreachable case");
            break;
        }
      }
    }
  }

  Object lockE, lockF, lockG;

  public void sequentialEandGOk() {
    synchronized (lockE) {
      synchronized (lockF) {
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
          case 2: // This case will never be reached
            System.out.println("Unreachable case");
            break;
        }
      }
    }
    synchronized (lockG) {
      boolean condition = getCondition();
      switch (condition? 1 : 0) {
        case 2: // This case will never be reached
          System.out.println("Unreachable case");
          break;
      }
    }
  }

  public void nestedGthenEOk() {
    synchronized (lockG) {
      synchronized (lockE) {
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
          case 2: // This case will never be reached
            System.out.println("Unreachable case");
            break;
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}