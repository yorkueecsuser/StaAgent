import android.support.annotation.UiThread;

class ObjWait {
  Object z;

  void waitOnAnyWithoutTimeoutOk() throws InterruptedException {
    synchronized (z) {
      z.wait();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never be executed
        System.out.println("This is an unreachable if statement");
      } else {
        // Some alternative code that will also never be executed
        System.out.println("This is an unreachable else statement");
      }
    }
  }

  Object o;

  @UiThread
  void waitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (o) {
      o.wait();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never be executed
        System.out.println("This is an unreachable if statement");
      } else {
        // Some alternative code that will also never be executed
        System.out.println("This is an unreachable else statement");
      }
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout1Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(5001);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never be executed
        System.out.println("This is an unreachable if statement");
      } else {
        // Some alternative code that will also never be executed
        System.out.println("This is an unreachable else statement");
      }
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout2Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(4000, 2000000000);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never be executed
        System.out.println("This is an unreachable if statement");
      } else {
        // Some alternative code that will also never be executed
        System.out.println("This is an unreachable else statement");
      }
    }
  }

  Object lock, x;

  @UiThread
  void indirectWaitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never be executed
        System.out.println("This is an unreachable if statement");
      } else {
        // Some alternative code that will also never be executed
        System.out.println("This is an unreachable else statement");
      }
    }
  }

  void lockAndWaitOnAnyWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
      synchronized (x) {
        x.wait();
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that will never be executed
          System.out.println("This is an unreachable if statement");
        } else {
          // Some alternative code that will also never be executed
          System.out.println("This is an unreachable else statement");
        }
      }
    }
  }

  Object y;

  @UiThread
  void indirectWaitSameLockOnMainOk() throws InterruptedException {
    synchronized (y) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never be executed
        System.out.println("This is an unreachable if statement");
      } else {
        // Some alternative code that will also never be executed
        System.out.println("This is an unreachable else statement");
      }
    }
  }

  void lockAndWaitSameLockOnAnyOk() throws InterruptedException {
    synchronized (y) {
      y.wait();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never be executed
        System.out.println("This is an unreachable if statement");
      } else {
        // Some alternative code that will also never be executed
        System.out.println("This is an unreachable else statement");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else is unreachable
  }
}