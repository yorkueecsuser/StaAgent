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
    future.get();
  }

  Object lockA, lockB;

  // deadlock should be reported between oneWayBad and anotherWayBad only
  void oneWayBad() {
    synchronized (lockA) {
      synchronized (lockB) {
      }
    }
  }

  void anotherWayBad() {
    synchronized (lockB) {
      synchronized (lockA) {
      }
    }
  }

  // this is creating a longer trace than anotherWayBad, so should be suppressed
  void thirdLongerWayBad() {
    anotherWayBad();
  }

  // Mutated code starts here

  CountDownLatch z;
  Future y;

  // only one report should be seen
  @UiThread
  void onUiThreadGood() throws InterruptedException, ExecutionException {
    callMethodWithMultipleBlocksGood();
  }

  // two reports are expected, last call location is always deduped in analysis
  @UiThread
  void callMethodWithMultipleBlocksGood() throws InterruptedException, ExecutionException {
    y.get();
    z.await();
    y.get();
  }

  Object x, w;

  // deadlock should be reported between oneWayGood and anotherWayGood only
  void oneWayGood() {
    synchronized (x) {
      synchronized (w) {
      }
    }
  }

  void anotherWayGood() {
    synchronized (w) {
      synchronized (x) {
      }
    }
  }

  // this is creating a longer trace than anotherWayGood, so should be suppressed
  void thirdLongerWayGood() {
    anotherWayGood();
  }
}