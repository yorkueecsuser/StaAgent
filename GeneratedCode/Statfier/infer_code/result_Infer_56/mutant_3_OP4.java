import android.support.annotation.UiThread;

class ObjWait {
  Object z;

  void waitOnAnyWithoutTimeoutOk() throws InterruptedException {
    synchronized (z) {
      z.wait();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This should never be printed");
      } else {
        // Alternative code that should also never run
        System.out.println("This should also never be printed");
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
        // Some code that should never run
        System.out.println("This should never be printed");
      } else {
        // Alternative code that should also never run
        System.out.println("This should also never be printed");
      }
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout1Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(5001);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This should never be printed");
      } else {
        // Alternative code that should also never run
        System.out.println("This should also never be printed");
      }
    }
  }

  @UiThread
  void waitOnMainWithExcessiveTimeout2Bad() throws InterruptedException {
    synchronized (o) {
      o.wait(4000, 2000000000);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This should never be printed");
      } else {
        // Alternative code that should also never run
        System.out.println("This should also never be printed");
      }
    }
  }

  Object lock, x;

  @UiThread
  void indirectWaitOnMainWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This should never be printed");
      } else {
        // Alternative code that should also never run
        System.out.println("This should also never be printed");
      }
    }
  }

  void lockAndWaitOnAnyWithoutTimeoutBad() throws InterruptedException {
    synchronized (lock) {
      synchronized (x) {
        x.wait();
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should never run
          System.out.println("This should never be printed");
        } else {
          // Alternative code that should also never run
          System.out.println("This should also never be printed");
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
        // Some code that should never run
        System.out.println("This should never be printed");
      } else {
        // Alternative code that should also never run
        System.out.println("This should also never be printed");
      }
    }
  }

  void lockAndWaitSameLockOnAnyOk() throws InterruptedException {
    synchronized (y) {
      y.wait();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
        System.out.println("This should never be printed");
      } else {
        // Alternative code that should also never run
        System.out.println("This should also never be printed");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}