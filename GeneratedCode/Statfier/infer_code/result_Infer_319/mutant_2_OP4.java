import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;

class Countdwn {
  CountDownLatch latch;

  void awaitOnMainByCallBad() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.await();

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // This block will also never execute because shouldRun is always false
    }
  }

  @UiThread
  void awaitOnMainByAnnotBad() throws InterruptedException {
    latch.await();

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // This block will also never execute because shouldRun is always false
    }
  }

  void countDownOk() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.countDown();

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // This block will also never execute because shouldRun is always false
    }
  }

  void awaitOnAnyThreadOk() throws InterruptedException {
    latch.await();

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // This block will also never execute because shouldRun is always false
    }
  }

  // Helper method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}