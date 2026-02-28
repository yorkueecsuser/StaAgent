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
    future.get();
    latch.await();
    latch.await(); // Mutant: duplicated assignment statement
    future.get();
  }

  Object lockA, lockB;

  // deadlock should be reported between oneWayBad and anotherWayBad only
  void oneWayBad() {
    synchronized (lockA) {
      synchronized (lockB) {
        lockA = lockA; // Mutant: duplicated assignment statement
      }
    }
  }

  void anotherWayBad() {
    synchronized (lockB) {
      synchronized (lockA) {
        lockB = lockB; // Mutant: duplicated assignment statement
      }
    }
  }

  // this is creating a longer trace than anotherWayBad, so should be suppressed
  void thirdLongerWayBad() {
    anotherWayBad();
    lockA = lockA; // Mutant: duplicated assignment statement
  }
}