import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;

class Countdwn {
  CountDownLatch latch;

  void awaitOnMainByCallBad() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.await();
    boolean condition = getUnreachableCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  @UiThread
  void awaitOnMainByAnnotBad() throws InterruptedException {
    latch.await();
    boolean condition = getUnreachableCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  void countDownOk() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.countDown();
    boolean condition = getUnreachableCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  void awaitOnAnyThreadOk() throws InterruptedException {
    latch.await();
    boolean condition = getUnreachableCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the condition effectively unreachable
  }
}