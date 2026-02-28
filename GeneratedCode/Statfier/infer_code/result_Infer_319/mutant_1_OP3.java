import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;

class Countdwn {
  CountDownLatch latch;

  void awaitOnMainByCallBad() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.await();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  @UiThread
  void awaitOnMainByAnnotBad() throws InterruptedException {
    latch.await();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable statement.");
    }
  }

  void countDownOk() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.countDown();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Yet another unreachable statement.");
    }
  }

  void awaitOnAnyThreadOk() throws InterruptedException {
    latch.await();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is yet another unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}