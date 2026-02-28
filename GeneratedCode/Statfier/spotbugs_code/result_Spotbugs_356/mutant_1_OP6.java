import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Ideas_2011_12_11 {

  final CountDownLatch latch = new CountDownLatch(1);

  public void waitForIt() throws TimeoutException, InterruptedException {
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    latch.await(5, TimeUnit.SECONDS);
  }

  public void countDown() {
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    latch.countDown();
  }

  private boolean getConditionForLoop() {
    return false;
  }
}