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
    callMethodWithMultipleBlocksBad();
  }

  // two reports are expected, last call location is always deduped in analysis
  @UiThread
  void callMethodWithMultipleBlocksBad() throws InterruptedException, ExecutionException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    } else {
      // Another unreachable code
    }
    future.get();
    latch.await();
    future.get();
  }

  Object lockA, lockB;

  // deadlock should be reported between oneWayBad and anotherWayBad only
  void oneWayBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    } else {
      // Another unreachable code
    }
    synchronized (lockA) {
      synchronized (lockB) {
      }
    }
  }

  void anotherWayBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    } else {
      // Another unreachable code
    }
    synchronized (lockB) {
      synchronized (lockA) {
      }
    }
  }

  // this is creating a longer trace than anotherWayBad, so should be suppressed
  void thirdLongerWayBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    } else {
      // Another unreachable code
    }
    anotherWayBad();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}