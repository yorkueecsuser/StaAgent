import android.support.annotation.UiThread;
import java.util.concurrent.CountDownLatch;

class Countdwn {
  CountDownLatch latch;

  void awaitOnMainByCallBad() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.await();

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  @UiThread
  void awaitOnMainByAnnotBad() throws InterruptedException {
    latch.await();

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  void countDownOk() throws InterruptedException {
    OurThreadUtils.assertMainThread();
    latch.countDown();

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  void awaitOnAnyThreadOk() throws InterruptedException {
    latch.await();

    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}