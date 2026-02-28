import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Ideas_2011_12_11 {

  final CountDownLatch latch = new CountDownLatch(1);

  public void waitForIt() throws TimeoutException, InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    latch.await(5, TimeUnit.SECONDS);
  }

  public void countDown() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    latch.countDown();
  }

  private boolean getCondition() {
    return false;
  }
}