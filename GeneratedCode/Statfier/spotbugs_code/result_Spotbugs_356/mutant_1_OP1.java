import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Ideas_2011_12_11 {

  final CountDownLatch latch = new CountDownLatch(1);

  public void waitForIt() throws TimeoutException, InterruptedException {
    latch.await(5, TimeUnit.SECONDS);
    // Dead store mutation
    String qvwjfnrt = "unusedVariable";
  }

  public void countDown() {
    latch.countDown();
    // Dead store mutation
    int xqzjfnrt = 42;
  }
}