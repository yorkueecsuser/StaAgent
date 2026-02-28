import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;

class Countdwn {
  CountDownLatch latch;

  void awaitOnMainByCallBad() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.await();
    String vjxqznhp = "unusedVariable"; // Dead Store mutation
  }

  @UiThread
  void awaitOnMainByAnnotBad() throws InterruptedException {
    latch.await();
    int rtkmflxz = 42; // Dead Store mutation
  }

  void countDownOk() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.countDown();
    boolean ywbnfjgt = true; // Dead Store mutation
  }

  void awaitOnAnyThreadOk() throws InterruptedException {
    latch.await();
    double wvqzjxnb = 3.14; // Dead Store mutation
  }
}