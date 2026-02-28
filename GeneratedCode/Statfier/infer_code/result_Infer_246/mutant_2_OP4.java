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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
    } else {
      // This block is unreachable if shouldRun is false
    }
    callMethodWithMultipleBlocksBad();
  }

  // two reports are expected, last call location is always deduped in analysis
  @UiThread
  void callMethodWithMultipleBlocksBad() throws InterruptedException, ExecutionException {
    future.get();
    latch.await();
    future.get();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
    } else {
      // This block is unreachable if shouldRun is false
    }
  }

  Object lockA, lockB;

  // deadlock should be reported between oneWayBad and anotherWayBad only
  void oneWayBad() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block is reachable if shouldRun is true
        } else {
          // This block is unreachable if shouldRun is false
        }
      }
    }
  }

  void anotherWayBad() {
    synchronized (lockB) {
      synchronized (lockA) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block is reachable if shouldRun is true
        } else {
          // This block is unreachable if shouldRun is false
        }
      }
    }
  }

  // this is creating a longer trace than anotherWayBad, so should be suppressed
  void thirdLongerWayBad() {
    anotherWayBad();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
    } else {
      // This block is unreachable if shouldRun is false
    }
  }

  private boolean getCondition() {
    return false; // This method can be used to dynamically determine the condition at runtime
  }
}