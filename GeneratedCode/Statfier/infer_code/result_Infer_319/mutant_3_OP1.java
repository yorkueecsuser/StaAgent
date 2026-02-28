import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;

class Countdwn {
  CountDownLatch latch;

  void awaitOnMainByCallBad() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.await();
    // Mutant: Dead Store
    String jxqfvtbw = "unusedVariable";
  }

  @UiThread
  void awaitOnMainByAnnotBad() throws InterruptedException {
    latch.await();
    // Mutant: Dead Store
    int qzjfnhty = 42;
  }

  void countDownOk() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.countDown();
    // Mutant: Dead Store
    boolean klmnopqr = true;
  }

  void awaitOnAnyThreadOk() throws InterruptedException {
    latch.await();
    // Mutant: Dead Store
    double wxyzabcd = 3.14;
  }
}