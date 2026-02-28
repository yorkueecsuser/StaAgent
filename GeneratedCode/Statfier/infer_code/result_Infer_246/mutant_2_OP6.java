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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  // two reports are expected, last call location is always deduped in analysis
  @UiThread
  void callMethodWithMultipleBlocksBad() throws InterruptedException, ExecutionException {
    future.get();
    latch.await();
    future.get();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  Object lockA, lockB;

  // deadlock should be reported between oneWayBad and anotherWayBad only
  void oneWayBad() {
    synchronized (lockA) {
      synchronized (lockB) {
      }
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  void anotherWayBad() {
    synchronized (lockB) {
      synchronized (lockA) {
      }
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  // this is creating a longer trace than anotherWayBad, so should be suppressed
  void thirdLongerWayBad() {
    anotherWayBad();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}