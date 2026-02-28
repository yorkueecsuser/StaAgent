import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;

class Countdwn {
  CountDownLatch latch;

  void awaitOnMainByCallBad() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.await();
    // Mutant code: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @UiThread
  void awaitOnMainByAnnotBad() throws InterruptedException {
    latch.await();
    // Mutant code: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void countDownOk() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.countDown();
    // Mutant code: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void awaitOnAnyThreadOk() throws InterruptedException {
    latch.await();
    // Mutant code: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}