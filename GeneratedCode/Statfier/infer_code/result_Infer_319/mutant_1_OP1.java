import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;

class Countdwn {
  CountDownLatch latch;

  void awaitOnMainByCallBad() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.await();
    // Dead store mutation
    String jxqfvtbn = "unusedVariable";
  }

  @UiThread
  void awaitOnMainByAnnotBad() throws InterruptedException {
    latch.await();
    // Dead store mutation
    int klmnopqr = 42;
  }

  void countDownOk() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.countDown();
    // Dead store mutation
    boolean rstuvwxy = true;
  }

  void awaitOnAnyThreadOk() throws InterruptedException {
    latch.await();
    // Dead store mutation
    double zabcdefgh = 3.14;
  }
}