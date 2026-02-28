import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Ideas_2011_12_11 {

  final CountDownLatch latch = new CountDownLatch(1);
  final CountDownLatch latchCopy = new CountDownLatch(1); // Unique duplicated assignment

  public void waitForIt() throws TimeoutException, InterruptedException {
    latch.await(5, TimeUnit.SECONDS);
    latch.await(5, TimeUnit.SECONDS); // Duplicated await call, but not an assignment
  }

  public void countDown() {
    latch.countDown();
    latch.countDown(); // Duplicated countDown call, but not an assignment
  }
}