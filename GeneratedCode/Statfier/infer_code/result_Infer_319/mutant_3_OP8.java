import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;

class Countdwn {
  CountDownLatch latch;

  void awaitOnMainByCallBad() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.await();
  }

  @UiThread
  void awaitOnMainByAnnotBad() throws InterruptedException {
    latch.await();
  }

  void countDownOk() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.countDown();
  }

  void awaitOnAnyThreadOk() throws InterruptedException {
    latch.await();
  }

  // Mutated code
  CountDownLatch x;

  void awaitOnMainByCallBadMutated() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    x.await();
  }

  @UiThread
  void awaitOnMainByAnnotBadMutated() throws InterruptedException {
    x.await();
  }

  void countDownOkMutated() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    x.countDown();
  }

  void awaitOnAnyThreadOkMutated() throws InterruptedException {
    x.await();
  }
}