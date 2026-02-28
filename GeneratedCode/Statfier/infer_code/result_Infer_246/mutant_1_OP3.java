import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class Dedup {
  CountDownLatch latch;
  Future future;

  // only one report should be seen
  @UiThread
  void onUiThreadBad() throws InterruptedException, ExecutionException {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
    }
    callMethodWithMultipleBlocksBad();
  }

  // two reports are expected, last call location is always deduped in analysis
  @UiThread
  void callMethodWithMultipleBlocksBad() throws InterruptedException, ExecutionException {
    future.get();
    latch.await();
    future.get();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
    }
  }

  Object lockA, lockB;

  // deadlock should be reported between oneWayBad and anotherWayBad only
  void oneWayBad() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean condition = getCondition();
        if (condition) {
          // This is an unreachable if statement
        }
      }
    }
  }

  void anotherWayBad() {
    synchronized (lockB) {
      synchronized (lockA) {
        boolean condition = getCondition();
        if (condition) {
          // This is an unreachable if statement
        }
      }
    }
  }

  // this is creating a longer trace than anotherWayBad, so should be suppressed
  void thirdLongerWayBad() {
    anotherWayBad();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}