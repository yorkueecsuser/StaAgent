import android.support.annotation.UiThread;

class ObjWait {
  Object z;

  void waitOnAnyWithoutTimeoutOk() throws InterruptedException {
    synchronized (z) {
      z.wait();
      // Mutant code start
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
      // Mutant code end
    }
  }

  Object o;

  @UiThread
  void waitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (o) {
      o.wait();
      // Mutant code start
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
      // Mutant code end
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout1Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(5001);
      // Mutant code start
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
      // Mutant code end
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout2Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(4000, 2000000000);
      // Mutant code start
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
      // Mutant code end
    }
  }

  Object lock, x;

  @UiThread
  void indirectWaitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
      // Mutant code start
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
      // Mutant code end
    }
  }

  void lockAndWaitOnAnyWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
      synchronized (x) {
        x.wait();
        // Mutant code start
        boolean condition = getCondition();
        switch (condition) {
          case true:
            // This case is intentionally left empty to make the switch statement unreachable
            break;
        }
        // Mutant code end
      }
    }
  }

  Object y;

  @UiThread
  void indirectWaitSameLockOnMainOk() throws InterruptedException {
    synchronized (y) {
      // Mutant code start
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
      // Mutant code end
    }
  }

  void lockAndWaitSameLockOnAnyOk() throws InterruptedException {
    synchronized (y) {
      y.wait();
      // Mutant code start
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
      // Mutant code end
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the switch is unreachable
  }
}