import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Ideas_2011_12_11 {

  final CountDownLatch latch = new CountDownLatch(1);

  public void waitForIt() throws TimeoutException, InterruptedException {
    latch.await(5, TimeUnit.SECONDS);
  }

  public void countDown() {
    latch.countDown();
  }

  // Mutated code
  final CountDownLatch b = new CountDownLatch(1);

  public void waitForX() throws TimeoutException, InterruptedException {
    b.await(5, TimeUnit.SECONDS);
  }

  public void countX() {
    b.countDown();
  }
}