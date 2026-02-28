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
      // This is an unreachable block due to the condition being false at runtime
    } else {
      // This is an unreachable block due to the condition being false at runtime
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
      // This is an unreachable block due to the condition being false at runtime
    } else {
      // This is an unreachable block due to the condition being false at runtime
    }
  }

  Object lockA, lockB;

  // deadlock should be reported between oneWayBad and anotherWayBad only
  void oneWayBad() {
    synchronized (lockA) {
      synchronized (lockB) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This is an unreachable block due to the condition being false at runtime
        } else {
          // This is an unreachable block due to the condition being false at runtime
        }
      }
    }
  }

  void anotherWayBad() {
    synchronized (lockB) {
      synchronized (lockA) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This is an unreachable block due to the condition being false at runtime
        } else {
          // This is an unreachable block due to the condition being false at runtime
        }
      }
    }
  }

  // this is creating a longer trace than anotherWayBad, so should be suppressed
  void thirdLongerWayBad() {
    anotherWayBad();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is an unreachable block due to the condition being false at runtime
    } else {
      // This is an unreachable block due to the condition being false at runtime
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else blocks are unreachable
  }
}