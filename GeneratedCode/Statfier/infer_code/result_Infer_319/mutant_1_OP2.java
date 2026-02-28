import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;

class Countdwn {
  CountDownLatch latch;

  void awaitOnMainByCallBad() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.await();
    // Mutant: Duplicating the assignment statement
    latch = latch;
  }

  @UiThread
  void awaitOnMainByAnnotBad() throws InterruptedException {
    latch.await();
    // Mutant: Duplicating the assignment statement
    latch = latch;
  }

  void countDownOk() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.countDown();
    // No applicable assignment statement without method invocation to duplicate
  }

  void awaitOnAnyThreadOk() throws InterruptedException {
    latch.await();
    // Mutant: Duplicating the assignment statement
    latch = latch;
  }
}